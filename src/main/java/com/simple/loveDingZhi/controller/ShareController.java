package com.simple.loveDingZhi.controller;

import com.simple.loveDingZhi.service.ImageApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by uidp5344 on 2017/3/16.
 */
@Controller
@RequestMapping("/share")
public class ShareController {
    @RequestMapping("/getImgBase64")
    public @ResponseBody String request_json2(HttpServletResponse response,HttpServletRequest request) throws Exception {
        String imgUrl=request.getParameter("imgUrl");
        /*String imgUrl="http://10.219.91.216:8080/images/business/cloth/e7f11d1b-ad12-4377-95bb-eacc85440aac_7.png";*/
        imgUrl = imgUrl.split(":8080")[1];
        String imgBase64="data:image/jpeg;base64,"+ImageApi.GetImageBase64ByUrl(ImageApi.getImgAbsolutePath()+imgUrl);
        /*return "{\"imgBase64\":\""+imgBase64+"\"}";*/
        return imgBase64;
        /*return "{\"flat\":true}";*/
    }
}
