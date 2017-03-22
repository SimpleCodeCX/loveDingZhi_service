package com.simple.loveDingZhi.controller;

import com.simple.loveDingZhi.po.*;
import com.simple.loveDingZhi.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by simple on 2016/11/24.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IDesignDrawingService designDrawingService;
    @Autowired
    private IDesignerLogoService designerLogoService;

    @Autowired
    private IBusinessClothService businessClothService;

    @Autowired
    private IBusinessLogoService businessLogoService;

    @Autowired
    private IUserAddressService userAddressService;

    /**
     * Created by simple on 2016/11/27.
     * 实现注册功能
     * 注册成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/register")
    public @ResponseBody String register(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String phoneNumber=request.getParameter("accountNumber");//手机号码
        String accountNumber=phoneNumber;//手机号码作为账号
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
        user.setAccountNumber(accountNumber);
        user.setPassword(newPassword);
        user.setPhoneNumber(phoneNumber);
        user.setTouXiangUrl("images/touXiang/default.jpg");//设置默认头像
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
     * 检查账号是否存在
     *如果存在，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/accountNumberIsExist")
    public @ResponseBody String accountNumberIsExist(HttpServletResponse response
            ,HttpServletRequest request){
        String accountNumber=request.getParameter("accountNumber");//手机号码即账号
        int count=userService.countByAccountNumber(accountNumber);
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
     * 登录成功，返回:
     *    userData=
             {
             isLogin:true,    //登录是否成功
             accountNumber："",//账号
             userName:"simple", //用户名
             realName:"dong",  //真实姓名
             phoneNumber:"15767973362", //手机号码
             address:"惠州学院" ,    /收货地址
             isDesigner：true,//是否为设计师
             isBusiness：true,//是否为商家
             touXiangUrl:""，//头像的base64位
             nickname:""//昵称
             }
     * 登录失败，返回:
     *   userData=
            {
                isLogin:false,
                userName:"",
                realName:"",
                phoneNumber:"",
                address:""
                ......
            }
     */
    @RequestMapping("/login")
    public @ResponseBody Map<String,Map> login(HttpServletResponse response,HttpServletRequest request)
            throws Exception {

      /*  Logger logger = LoggerFactory.getLogger(AccountController.class);
        logger.info("登录控制器");*/
        /*System.out.println(request.getSession().getServletContext().getRealPath("images"));*/
        String accountNumber=request.getParameter("accountNumber");
        String password=request.getParameter("password");
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的密码
        String newPassword=base64en.encode(md5.digest(password.getBytes("utf-8")));
        //前端传回来的用户数据
        User userView=new User();
        userView.setAccountNumber(accountNumber);
        userView.setPassword(newPassword);
        int count=userService.countBySelective(userView);
        Map map = new HashMap();
        if(count==1){
            System.out.println("login成功....");
            //从数据库取出的用户数据
            User userData=new User();
            userData=userService.selectBySelective(userView);
            map.put("isLogin",true);
            map.put("userName",userData.getUserName());
            map.put("accountNumber",userData.getAccountNumber());
            /*map.put("password",userData.getPassword());*/
            map.put("realName",userData.getRealName());
            map.put("phoneNumber",userData.getPhoneNumber());
            map.put("address",userData.getAddress());
            map.put("isDesigner",userData.getIsDesigner());
            map.put("isBusiness",userData.getIsBusiness());
            map.put("touXiangUrl","data:image/jpeg;base64,"+ImageApi.GetImageBase64ByUrl(ImageApi.getImgAbsolutePath()+userData.getTouXiangUrl()));
            /*头像url:"http://"+request.getServerName()+":"+request.getServerPort()+"/"+userData.getTouXiangUrl()*/
            /*map.put("touXiangUrl","../img/sjg/sjg3.jpg");*/
            map.put("nickname",userData.getNickname());
            request.getSession().setAttribute("ID",userData.getAccountNumber());

        }
        else{
            map.put("isLogin",false);
        }

        Map<String,Map> userDataMap=new HashMap<String, Map>();
        userDataMap.put("userData",map);
        return userDataMap;
    }

    /**
     * Created by simple on 2016/12/05.
     * 实现退出登录
     * 修改成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/loginOut_authority")
    public @ResponseBody String loginOut(HttpServletRequest request){
        HttpSession httpSession=request.getSession();
        httpSession.setAttribute("ID", null);
        if(httpSession.getAttribute("ID")==null){
            return "{\"flat\":true}";
        }
        return "{\"flat\":false}";
    }


    /**
     * Created by simple on 2016/12/03.
     * 实现修改用户名
     * 修改成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/updateUserName_authority")
    public @ResponseBody String updateUserName(HttpServletRequest request){
        String accountNumber=request.getParameter("accountNumber");//账号
        String userName=request.getParameter("userName");//用户名
        //前端传回来的用户数据
        User user=new User();
        user.setAccountNumber(accountNumber);
        user.setUserName(userName);
        if(userService.updateByAccountNumberSelective(user)!=1){
            return "{\"flat\":false}";
        }
        return "{\"flat\":true}";
    }

    /**
     * Created by simple on 2016/12/08.
     * 实现修改用户头像
     * 修改成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/updateUserTouXiang_authority")
    public @ResponseBody String updateUserTouXiang(HttpServletRequest request){
        String accountNumber=request.getParameter("accountNumber");//账号
        String touXiangBase64=request.getParameter("touXiang");//用户头像base64位编码
        String relativeTouXiangUrl="images/touXiang/"+accountNumber+".jpg";//相对路径image/touXiang/账号.jpg
        String absoluteTouXiangUrl=ImageApi.getImgAbsolutePath()+relativeTouXiangUrl;//绝对路径
        ImageApi.GenerateImage(touXiangBase64,absoluteTouXiangUrl);//保存图片
        /*System.out.println("http://"+request.getServerName()+":"+request.getServerPort());*/
        //前端传回来的用户数据
        User user=new User();
        user.setAccountNumber(accountNumber);
        user.setTouXiangUrl(relativeTouXiangUrl);
        if(userService.updateByAccountNumberSelective(user)!=1){
            return "{\"flat\":false}";
        }
        return "{\"flat\":true}";
    }

    /**
     * Created by simple on 2017/02/05.
     * 获得我的设计稿列表数据（注意：是我的）
     * 返回我的设计稿列表数据：List<DesignDrawing>
     */
    @RequestMapping("/getMySjgList_authority")
    public @ResponseBody List<DesignDrawing> getMySjgList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String userName= request.getParameter("userName");
        List<DesignDrawing> designDrawingList = designDrawingService.selectListByUserName(userName);
        return designDrawingList;
    }

    /**
     * Created by simple on 2017/02/05.
     * 获得我的logo列表数据（注意：是我的）
     * 返回我的logo列表数据：List<DesignerLogo>
     */
    @RequestMapping("/getMyLogoList_authority")
    public @ResponseBody List<DesignerLogo> getMyLogoList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String userName= request.getParameter("userName");
        List<DesignerLogo> designerLogoList = designerLogoService.selectListByUserName(userName);
        return designerLogoList;
    }

    /**
     * Created by simple on 2017/03/01.
     * 获得我的商城的衣服列表数据（注意：是我的）
     * 返回衣服商品列表数据：List<BusinessCloth>
     */
    @RequestMapping("/getMyShangChengClothList_authority")
    public @ResponseBody List<BusinessCloth> getMyShangChengClothList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String userName= request.getParameter("userName");
        List<BusinessCloth> businessClothList = businessClothService.selectListByUserName(userName);
        return businessClothList;
    }

    /**
     * Created by simple on 2017/03/01.
     * 获得我的商城的衣服列表数据（注意：是我的）
     * 返回衣服商品列表数据：List<BusinessLogo>
     */
    @RequestMapping("/getMyShangChengLogoList_authority")
    public @ResponseBody List<BusinessLogo> getMyShangChengLogoList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String userName= request.getParameter("userName");
        List<BusinessLogo> businessClothList = businessLogoService.selectListByUserName(userName);
        return businessClothList;
    }
    /**
     * Created by simple on 2017/03/21.
     * 保存用户的收货地址  需要登录
     * 保存成功，返回{flat:true,userAddressId:number},否则返回{flat:false}
     */
    @RequestMapping("/saveUserAddress_authority")
    public @ResponseBody String saveUserAddress(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        String realName=request.getParameter("realName");
        String phoneNumber=request.getParameter("phoneNumber");
        String sheng=request.getParameter("sheng");
        String shi=request.getParameter("shi");
        String qu=request.getParameter("qu");
        String detailAddress=request.getParameter("detailAddress");
        String postalcode=request.getParameter("postalcode");
        //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();

        //保存用户收货地址
        UserAddress userAddress=new UserAddress();
        userAddress.setUserId(userId);
        userAddress.setSheng(sheng);
        userAddress.setShi(shi);
        userAddress.setQu(qu);
        userAddress.setDetailAddress(detailAddress);
        userAddress.setPostalcode(postalcode);
        userAddress.setRealName(realName);
        userAddress.setPhoneNumber(phoneNumber);
        int  count= userAddressService.insertSelectiveReturnId(userAddress);
        Integer userAddressId=userAddress.getUserAddressId();

        if(count==1)
        {
            return "{\"flat\":true,\"userAddressId\":"+userAddressId+"}";
        }
        else{
            return "{\"flat\":false}";
        }

    }

   


}
