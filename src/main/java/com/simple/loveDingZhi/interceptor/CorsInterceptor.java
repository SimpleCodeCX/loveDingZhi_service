package com.simple.loveDingZhi.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by simple on 2016/11/29.
 */
public class CorsInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*此拦截器用于设置一些公用的配置*/
        /*设置请求和响应编码*/
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("utf-8");
        /*response.setContentType("text/html; charset=utf-8");*/
        //获得访问者域名
        String originUrl=request.getHeader("origin");
        //允许跨域

        response.setHeader("Access-Control-Allow-Origin", originUrl);
        /*允许响应cookie*/
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
