package com.simple.loveDingZhi.controller;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;
import com.simple.loveDingZhi.po.*;
import com.simple.loveDingZhi.service.*;
import jdk.nashorn.internal.runtime.RewriteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
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
    private IDesignerLogoService designerLogoService;
    @Autowired
    private IDesignDrawingImgService designDrawingImgService;
    @Autowired
    private  IDesignerService designerService;


    /**
     * Created by simple on 2016/12/11.
     * 获得设计师列表数据,无需登录
     * 返回：
     *
     [{
     userId:21，//用户id
     userName:"simple", //用户名
     nickname:"擅长衣服设计",//个性签名
     worksCount:20，//作品数
     touXiangUrl："images/touXiang/123.jpg"//头像url
     }]
     */
    @RequestMapping("/getDesignerList")
    public @ResponseBody List<DesignerCustom> getDesignerList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        List<DesignerCustom> designerCustomList = designerService.selectDesignerList();
        return designerCustomList;
    }

    /**
     * Created by simple on 2017/02/05.
     * 获得设计师的设计稿列表数据,无需登录
     * 返回设计稿列表数据：List<DesignDrawing>
     */
    @RequestMapping("/getSjgList")
    public @ResponseBody List<DesignDrawing> getSjgList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer page=Integer.parseInt(request.getParameter("page"));
        List<DesignDrawing> designDrawingList = designDrawingService.selectListOnePage(page);
        return designDrawingList;
    }

    /**
     * Created by simple on 2017/02/05.
     * 获得设计师的logo列表数据,无需登录
     * 返回logo列表数据：List<DesignerLogo>
     */
    @RequestMapping("/getDesignerLogoList")
    public @ResponseBody List<DesignerLogo> getDesignerLogoList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer page=Integer.parseInt(request.getParameter("page"));
        List<DesignerLogo>designerLogoList=designerLogoService.selectListOnePage(page);
        return designerLogoList;
    }







    /**
     * Created by simple on 2016/12/14.
     * 获得一个设计师的详情数据,无需登录
     * 返回设计师的详情数据:DesignerVo数据结构
     */
    @RequestMapping("/getDesignerDetails")
    public @ResponseBody DesignerVo getDesignerDetails(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer userId=Integer.parseInt(request.getParameter("userId"));//账号
        DesignerVo designerVo = designerService.selectDesignerDetailsByUserId(userId);
        return designerVo;
    }

    /**
     * Created by simple on 2017/02/05.
     * 根据设计稿id获得一个设计稿的详情数据,无需登录
     * 返回设计稿的详情数据:DesignDrawing数据结构
     */
    @RequestMapping("/getSjgDetails")
    public @ResponseBody DesignDrawing getSjgDetails(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer sjgId=Integer.parseInt(request.getParameter("sjgId"));//设计稿id
        DesignDrawing designDrawing=designDrawingService.selectByPrimaryKey(sjgId);
        return designDrawing;
    }

    /**
     * Created by simple on 2017/02/22.
     * 根据logo的id获得一个logo的详情数据,无需登录
     * 返回logo的详情数据:DesignerLogoVo的数据结构
     */
    @RequestMapping("/getDesignerLogoDetails")
    public @ResponseBody DesignerLogoVo getDesignerLogoDetails(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer designerLogoId=Integer.parseInt(request.getParameter("designerLogoId"));//logo的id
        System.out.println(designerLogoId);
        DesignerLogoVo designerLogoVo=designerLogoService.selectDesignerLogoDetailsByDesignerLogoId(designerLogoId);
        return designerLogoVo;
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
        //保存设计稿描述
        String uuid=UUID.randomUUID().toString();//生成唯一值
        String firstSjgUrl="images/designer/sjg/"+uuid+"_0.png";//使用第一张图片作为设计稿集封面
        DesignDrawing designDrawing=new DesignDrawing();
        designDrawing.setAuthor(userId);
        designDrawing.setCaption(caption);
        designDrawing.setIntroduction(introduction);
        designDrawing.setFirstImgUrl(firstSjgUrl);
        int count= designDrawingService.insertSelectiveReturnId(designDrawing);
        if(count!=1){
            return "{\"flat\":false}";
        }
        //保存设计稿图片
        int designDrawingId=designDrawing.getId();
        DesignDrawingImg designDrawingImg=new DesignDrawingImg();
        designDrawingImg.setDesignDrawingId(designDrawingId);
        String sjgRelativeUrl="";//相对路径image/designer/sjg/账号_序号.jpg
        String sjgAbsoluteUrl;//绝对路径

        for(int i=0;i<sjgImgsBase64Strs.length;i++){
            sjgRelativeUrl="images/designer/sjg/"+uuid+"_"+i+".png";
            sjgAbsoluteUrl= ImageApi.getImgAbsolutePath()+sjgRelativeUrl;//绝对路径
            ImageApi.GenerateImage(sjgImgsBase64Strs[i],sjgAbsoluteUrl);//保存图片
            designDrawingImg.setImgUrl(sjgRelativeUrl);
            designDrawingImgService.insertSelective(designDrawingImg);
            designDrawingImg.setImgUrl("");
        }
        //让设计师的作品数加1
        designerService.updateCountByUserId(userId);


        return "{\"flat\":true}";
    }


    /**
     * Created by simple on 2017/02/06.
     * 上传设计师logo
     * 上传成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/designerUploadLogo_authority")
    public @ResponseBody String designerUploadLogo(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        String caption=request.getParameter("caption");//logo标题
        String introduction=request.getParameter("introduction");//logo介绍（灵感）
        String logoImgsBase64=request.getParameter("logoImgs");//logo base64

        //保存logo图片
        String uuid=UUID.randomUUID().toString();//生成唯一值
        String logoRelativeUrl="";//相对路径image/designer/logo/账号_序号.jpg
        String logoAbsoluteUrl;//绝对路径
        logoRelativeUrl="images/designer/logo/"+uuid+"_0.png";
        logoAbsoluteUrl= ImageApi.getImgAbsolutePath()+logoRelativeUrl;//绝对路径
        ImageApi.GenerateImage(logoImgsBase64,logoAbsoluteUrl);//保存图片
        //保存logo数据到数据库
          //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        DesignerLogo designerLogo=new DesignerLogo();
        designerLogo.setAuthor(userId);
        designerLogo.setCaption(caption);
        designerLogo.setIntroduction(introduction);
        designerLogo.setImgUrl(logoRelativeUrl);
        /*保存到数据库*/
        int count= designerLogoService.insertSelective(designerLogo);
        if(count!=1){
            return "{\"flat\":false}";
        }

        //让设计师的logo数加1，目前暂时不需要这个功能，等到以后需要的时候再扩展

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




        //根据账号获得用户的userId
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //将设计师的申请数据保存到数据库
        DesignerCertification designerCertification=new DesignerCertification();
        designerCertification.setEduLevel(educationBackground);//学历
        designerCertification.setMajor(major);//专业名
        designerCertification.setMajorCertificationUrl(majorRelativeUrl);//专业证书
        designerCertification.setWorksUrl(sjgRelativeUrlAll);//设计稿图片
        designerCertification.setUserId(userId);//用户id
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

        //配置设计师特有的信息
        Designer designer=new Designer();
        designer.setUserId(userId);//用户id
        designer.setWorksCount(0);//作品数为0
        designer.setIntroduction("暂无介绍");
        designerService.insertSelective(designer);
        return "{\"flat\":true}";
    }
}
