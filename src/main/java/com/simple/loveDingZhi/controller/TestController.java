package com.simple.loveDingZhi.controller;

import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by simple on 2016/11/26.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public void index(HttpServletResponse response) throws Exception {
        //        返回json字符串
        User user=userService.findUserById(1);
        response.getWriter().write(user.getId().toString());
    }

    @RequestMapping("/jsonData1")
    public @ResponseBody String jsonData1(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "{\"name\":\"dong\",\"age\":2}";
    }

    @RequestMapping("/jsonData2")
    public @ResponseBody
    User jsonData2(HttpServletResponse response,HttpServletRequest request) throws Exception {
        User user1=userService.findUserById(231);
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 这个可以用过滤器统一处理
       /* if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            // CORS "pre-flight" request
            response.addHeader("Access-Control-Allow-Origin", "http://localhost:63342");
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "accept, content-type, x-pingother");
            *//*response.addHeader("Access-Control-Max-Age", "1800");//30 min*//*
        }*/

         /*   if("OPTIONS".equals(request.getMethod())){
            //设置Access-Control-Allow相关头
            response.getWriter().flush();

            return "";
        }*/
        /*Access-Control-Max-Age: 86400*/
        return user1;
    }

    @RequestMapping("/jsonData3")
    public @ResponseBody
    List<User> jsonData3(HttpServletResponse response,HttpServletRequest request) throws Exception {
        List<User> userList=new ArrayList<User>();
        User user1=userService.findUserById(231);
        userList.add(user1);
        userList.add(user1);
        return userList;
    }

    @RequestMapping("/jsonData4")
    public @ResponseBody Map jsonData4(HttpServletResponse response){

        Map params =  new HashMap();
         params.put("username", "1213");
         params.put("user_json", "2222");
        return params;
    }
    @RequestMapping("/getUser2")
    public @ResponseBody String request_json2(HttpServletResponse response) throws Exception {
        return "flightHandler({name:'hello'})";
    }

    /*----------------------------测试session------------------------------------------*/
    /**
     * Created by simple on 2016/11/27.
     */
    @RequestMapping("/login1")
    public @ResponseBody String login1(HttpServletResponse response,HttpServletRequest request) throws UnsupportedEncodingException {
        request.getSession().setAttribute("name","dong");
        return "{\"name\":\"懂\",\"age\":2}";
        /*Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
        System.out.println("------------------------"+cookies.length+"----------------------------");
        return "设置session成功";*/
        /*for(Cookie cookiee : cookies){
            System.out.println(cookiee.getName()+" "+cookiee.getValue());
        }
        return "设置session成功";*/

    }

    /**
     * Created by simple on 2016/11/27.
     */
    @RequestMapping("/login2")
    public @ResponseBody String login2(HttpServletResponse response,HttpServletRequest request) {
        HttpSession session=request.getSession();
        System.out.println(session.getAttribute("name"));
        return session.getAttribute("name").toString();

    }
    @RequestMapping("/login3_authority")
    public @ResponseBody String login3(HttpServletResponse response,HttpServletRequest request) {
        HttpSession session=request.getSession();
        System.out.println(session.getAttribute("name"));
        return session.getAttribute("name").toString();

    }


}
