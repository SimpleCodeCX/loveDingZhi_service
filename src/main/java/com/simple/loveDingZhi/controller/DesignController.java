package com.simple.loveDingZhi.controller;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;
import com.simple.loveDingZhi.po.DesignerCertification;
import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IDesignerCertificationService;
import com.simple.loveDingZhi.service.IUserService;
import com.simple.loveDingZhi.service.ImageApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by simple on 2016/12/9.
 */
@Controller
@RequestMapping("/design")
public class DesignController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IDesignerCertificationService designerCertificationService;
    /**
     * Created by simple on 2016/12/9.
     * 实现申请成为设计师的功能
     * 提交成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/applyDesigner_authority")
    public @ResponseBody String register(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        request.setCharacterEncoding("UTF-8");
        String accountNumber=request.getParameter("accountNumber");//账号
        String educationBackground=request.getParameter("educationBackground");//学历
        String major=request.getParameter("major");//专业
        String majorImgBase64=request.getParameter("majorImg");//专业证书
        String sjgImgsBase64=request.getParameter("sjgImgs");//设计稿，若有多张图片，以&_&分隔
        String[] sjgImgsBase64Strs=sjgImgsBase64.split("&_&");
        //保存专业证书图片
        String majorRelativeUrl="images/applyDesigner/major/"+accountNumber+".jpg";//相对路径image/touXiang/账号.jpg
        String majorAbsoluteUrl= ImageApi.getImgAbsolutePath()+majorRelativeUrl;//绝对路径
        ImageApi.GenerateImage(majorImgBase64,majorAbsoluteUrl);//保存图片
        //保存设计稿图片

        String sjgRelativeUrl="";//相对路径image/sjg/账号_序号.jpg
        String sjgRelativeUrlAll="";//将所有设计好的相对路径都存放在这里，以&_&作为分隔符
        String sjgAbsoluteUrl;//绝对路径
        for(int i=1;i<=sjgImgsBase64Strs.length;i++){
            sjgRelativeUrl="images/applyDesigner/sjg/"+accountNumber+"_"+i+".jpg";
            if(i==1){
                sjgRelativeUrlAll=sjgRelativeUrlAll+sjgRelativeUrl;
            }else {
                sjgRelativeUrlAll=sjgRelativeUrlAll+"&_&"+sjgRelativeUrl;
            }
            sjgAbsoluteUrl= ImageApi.getImgAbsolutePath()+sjgRelativeUrl;//绝对路径
            ImageApi.GenerateImage(sjgImgsBase64Strs[i-1],sjgAbsoluteUrl);//保存图片
        }
        /*System.out.println(strs.length);*/




        //根据账号获得用户的数据
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        //将数据放在designerCertification model里
        DesignerCertification designerCertification=new DesignerCertification();
        designerCertification.setEduLevel(educationBackground);//学历
        designerCertification.setMajor(major);//专业名
        designerCertification.setMajorCertificationUrl(majorRelativeUrl);//专业证书
        designerCertification.setWorksUrl(sjgRelativeUrlAll);//设计稿图片
        designerCertification.setUserId(user.getId());//用户id
        int count=designerCertificationService.insertSelective(designerCertification);
        if(count!=1){
            return "{\"flat\":false}";
        }
        //接下来帮用户开通设计师功能，代表用户开通设计师功能成功，本来是需要做审核的步骤的，这里暂时全部通过
        /*user=null;//清空上面的数据*/
        User user1=new User();
        user1.setAccountNumber(accountNumber);
        user1.setIsDesigner(true);
        userService.updateByAccountNumberSelective(user1);
        return "{\"flat\":true}";
    }
}
