package com.simple.loveDingZhi.controller;

import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by simple on 2016/11/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public void index(HttpServletResponse response) throws Exception {
        //        返回json字符串
        User user=userService.findUserById(1);
        response.getWriter().write(user.getId().toString());
    }

    @RequestMapping("/getUser")
    public @ResponseBody User request_json() throws Exception {
        User user1=userService.findUserById(1);
        return user1;
    }

}
