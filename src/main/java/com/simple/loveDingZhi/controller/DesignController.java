package com.simple.loveDingZhi.controller;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;
import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignDrawingImg;
import com.simple.loveDingZhi.po.DesignerCertification;
import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

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
    @Autowired
    private IDesignDrawingService designDrawingService;
    @Autowired
    private IDesignDrawingImgService designDrawingImgService;
    /**
     * Created by simple on 2016/12/11.
     * 获得设计师数据,无需登录
     * 返回：
     *  designerList=
     {
     accountNumber："",//账号
     userName:"simple", //用户名
     nickname:"擅长衣服设计",//个性签名
     worksCount:20//作品数
     }
     */
    @RequestMapping("/getDesignerList")
    public @ResponseBody String getDesigner(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {


        return "{\"flat\":true}";
    }

    /**
     * Created by simple on 2016/12/11.
     * 上传设计稿
     * 上传成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/designerUploadSjs_authority")
    public @ResponseBody String designerUploadSjs(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        String caption=request.getParameter("caption");//设计稿标题
        String introduction=request.getParameter("introduction");//设计稿介绍（灵感）
        String sjgImgsBase64=request.getParameter("sjgImgs");//设计稿base64,多张图片以&_&作为分隔符
        String []sjgImgsBase64Strs=sjgImgsBase64.split("&_&");
        //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //保存设计稿
        DesignDrawing designDrawing=new DesignDrawing();
        designDrawing.setAuthor(userId);
        designDrawing.setCaption(caption);
        designDrawing.setIntroduction(introduction);
        int count= designDrawingService.insertSelectiveReturnId(designDrawing);
        if(count!=1){
            return "{\"flat\":false}";
        }
        //保存图片
        int designDrawingId=designDrawing.getId();
        DesignDrawingImg designDrawingImg=new DesignDrawingImg();
        designDrawingImg.setDesignDrawingId(designDrawingId);
        String sjgRelativeUrl="";//相对路径image/designer/sjg/账号_序号.jpg
        String sjgAbsoluteUrl;//绝对路径
        String uuid=UUID.randomUUID().toString();//生成唯一值
        for(int i=0;i<sjgImgsBase64Strs.length;i++){
            sjgRelativeUrl="images/designer/sjg/"+uuid+"_"+i+".png";
            sjgAbsoluteUrl= ImageApi.getImgAbsolutePath()+sjgRelativeUrl;//绝对路径
            ImageApi.GenerateImage(sjgImgsBase64Strs[i],sjgAbsoluteUrl);//保存图片
            designDrawingImg.setImgUrl(sjgRelativeUrl);
            designDrawingImgService.insertSelective(designDrawingImg);
            designDrawingImg.setImgUrl("");
        }
        return "{\"flat\":true}";
    }


    /**
     * Created by simple on 2016/12/9.
     * 实现申请成为设计师的功能
     * 提交成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/applyDesigner_authority")
    public @ResponseBody String applyDesigner(HttpServletResponse response,HttpServletRequest request)
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
