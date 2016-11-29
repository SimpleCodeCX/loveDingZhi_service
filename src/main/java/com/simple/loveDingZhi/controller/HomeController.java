package com.simple.loveDingZhi.controller;

import com.mysql.jdbc.log.LogFactory;
import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by simple on 2016/11/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public ModelAndView index(HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("jsp1");
        Logger logger= LoggerFactory.getLogger(HomeController.class);
        logger.error("错误");
        logger.info("ddddddd");
        return modelAndView;
    }

    @RequestMapping("/getUser")
    public @ResponseBody User request_json(HttpServletResponse response,HttpServletRequest request) throws Exception {
        User user1=userService.findUserById(1);
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 这个可以用过滤器统一处理
       /* if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            // CORS "pre-flight" request
            response.addHeader("Access-Control-Allow-Origin", "http://localhost:63342");
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "accept, content-type, x-pingother");
            *//*response.addHeader("Access-Control-Max-Age", "1800");//30 min*//*
        }*/
        /*Access-Control-Max-Age: 86400*/
        return user1;
    }

    @RequestMapping("/getUserList")
    public @ResponseBody List<User> request_jsonList(HttpServletResponse response,HttpServletRequest request) throws Exception {
        List<User> userList=new ArrayList<User>();
        User user1=userService.findUserById(1);
        userList.add(user1);
        userList.add(user1);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return userList;
    }

    @RequestMapping("/getUser2")
    public @ResponseBody String request_json2(HttpServletResponse response) throws Exception {
     /*   response.setHeader("Access-Control-Allow-Origin", "*");
        User user1=userService.findUserById(1);
        //return user1;
     */
        return "flightHandler({name:'hello'})";
    }

}

