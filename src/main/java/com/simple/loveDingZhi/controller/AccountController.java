package com.simple.loveDingZhi.controller;

import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.SelectableChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by simple on 2016/11/24.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IUserService userService;

    /**
     * Created by simple on 2016/11/27.
     * 实现注册功能
     *注册成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/register")
    public @ResponseBody String register(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        /*request.setCharacterEncoding("UTF-8");*/
        response.addHeader("Access-Control-Allow-Origin", "*");
        String phoneNumber=request.getParameter("phoneNumber");//手机号码即账号
        String password=request.getParameter("password");//密码
        String userName=phoneNumber;//用户名初始化为手机号码

        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的密码
        String newPassword=base64en.encode(md5.digest(password.getBytes("utf-8")));

        //保存到数据库
        User user=new User();
        user.setUserName(userName);
        user.setPassword(newPassword);
        user.setPhoneNumber(phoneNumber);
        user.setIsBusiness(false);//初始化为未开通商家功能
        user.setIsDesigner(false);//初始化为未开通设计功能

        int  count= userService.insertSelective(user);
        System.out.println(count);
        if(count==1)
        {
            return "{\"flat\":true}";
        }
        else{
            return "{\"flat\":false}";
        }

    }

    /**
     * Created by simple on 2016/11/27.
     * 检查手机号码即账号是否存在
     *如果存在，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/phoneNumberIsExist")
    public @ResponseBody String phoneNumberIsExist(HttpServletResponse response
            ,HttpServletRequest request){
        response.addHeader("Access-Control-Allow-Origin", "*");
        String phoneNumber=request.getParameter("phoneNumber");//手机号码即账号
        int count=userService.countByPhoneNumber(phoneNumber);
        boolean flat;
        if(count==1){
            flat=true;
        }
        else{
            flat=false;
        }
        return "{\"flat\":"+flat+"}";
    }

    /**
     * Created by simple on 2016/11/27.
     * 实现登录功能
     *登录成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/login")
    public @ResponseBody String login(HttpServletResponse response,HttpServletRequest request)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        response.addHeader("Access-Control-Allow-Origin", "*");
        String phoneNumber=request.getParameter("phoneNumber");
        String password=request.getParameter("password");
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的密码
        String newPassword=base64en.encode(md5.digest(password.getBytes("utf-8")));
        User user=new User();
        user.setPhoneNumber(phoneNumber);
        user.setPassword(newPassword);
        int count=userService.countBySelective(user);
        boolean flat;
        if(count==1){
            HttpSession session=request.getSession();
            session.setAttribute("name","dong");
            System.out.println(session.getAttribute("name"));
            flat=true;
        }
        else{
            flat=false;
        }

        return "{\"flat\":"+flat+"}";
    }




}
