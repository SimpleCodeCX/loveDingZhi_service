package com.simple.loveDingZhi.controller;

/**
 * Created by uidp5344 on 2017/2/27.
 */

import com.simple.loveDingZhi.po.Business;
import com.simple.loveDingZhi.po.Designer;
import com.simple.loveDingZhi.po.DesignerCertification;
import com.simple.loveDingZhi.po.User;
import com.simple.loveDingZhi.service.IBusinessService;
import com.simple.loveDingZhi.service.IUserService;
import com.simple.loveDingZhi.service.ImageApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IBusinessService businessService;

    @RequestMapping("/jsonData3")
    public @ResponseBody
    List<User> jsonData3(HttpServletResponse response,HttpServletRequest request) throws Exception {
        List<User> userList=new ArrayList<User>();
        User user1=userService.findUserById(263);
        userList.add(user1);
        userList.add(user1);
        return userList;
    }

    /**
     * Created by simple on 2017/2/27.
     * 实现申请成为商家的功能
     * 提交成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/applyBusiness_authority")
    public @ResponseBody
    String applyBusiness(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        request.setCharacterEncoding("UTF-8");

        String accountNumber=request.getParameter("accountNumber");//账号
        String businessLicenseImgBase64=request.getParameter("businessLicenseImg");//专业证书

        //保存营业执照图片
        String businessLicenseRelativeUrl="images/applyBusiness/businessLicense/"+accountNumber+".jpg";//相对路径images/applyBusiness/businessLicense/账号.jpg
        String businessLicenseAbsoluteUrl= ImageApi.getImgAbsolutePath()+businessLicenseRelativeUrl;//绝对路径
        ImageApi.GenerateImage(businessLicenseImgBase64,businessLicenseAbsoluteUrl);//保存图片



        //根据账号获得用户的userId
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //将商家的申请数据保存到数据库
        //...暂不实现
        //接下来帮用户开通商家的功能，代表用户开通商家功能成功，本来是需要做审核的步骤的，这里暂时全部通过

        User user1=new User();
        user1.setAccountNumber(accountNumber);
        user1.setIsBusiness(true);
        userService.updateByAccountNumberSelective(user1);

        //配置商家特有的信息
        Business business=new Business();
        business.setUserId(userId);//用户id
        business.setIntroduction("暂无介绍");
        businessService.insertSelective(business);
        return "{\"flat\":true}";
    }

}
