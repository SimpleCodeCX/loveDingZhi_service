package com.simple.loveDingZhi.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by simple on 2016/11/29.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获得session
        HttpSession session=request.getSession();
        System.out.println("session ID is "+session.getAttribute("ID"));
        //验证用户是否登录
        if(session.getAttribute("ID")!=null){
            //身份存在，放行
            return true;
        }
        //执行到这里说明用户还未登录，需要登录
     /*   if(request.getHeader("x-requested-with")!=null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest"))//如果请求头包含x-requested-with，说明是ajax请求，
        {
            response.getWriter().println(originUrl);
            return false;
        }*/

        response.getWriter().println("{\"message\":\"还未登录\"}");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
