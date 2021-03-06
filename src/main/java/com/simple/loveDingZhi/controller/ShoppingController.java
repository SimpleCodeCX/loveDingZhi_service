package com.simple.loveDingZhi.controller;

/**
 * Created by uidp5344 on 2017/2/27.
 */

import com.simple.loveDingZhi.po.*;
import com.simple.loveDingZhi.service.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;


@Controller
@RequestMapping("/shopping")
public class ShoppingController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IBusinessService businessService;

    @Autowired
    private IBusinessClothService businessClothService;

    @Autowired
    private IBusinessLogoService businessLogoService;

    @Autowired
    private IMyDiyClothService myDiyClothService;

    @Autowired
    private IUserAddressService userAddressService;

    @Autowired
    private IShopOrdersService shopOrdersService;

    @Autowired
    private IShopOrdersDetailService shopOrdersDetailService;

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


    /**
     * Created by simple on 2017/03/01.
     * 上传商家衣服商品
     * 上传成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/shangjiaUploadCloth_authority")
    public @ResponseBody String shangjiaUploadCloth(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        String caption=request.getParameter("caption");//衣服商品标题
        int price=Integer.parseInt(request.getParameter("price"));//衣服商品标题
        String introduction=request.getParameter("introduction");//商品描述
        String shangjiaClothImgBase64=request.getParameter("shangjiaClothImg");//商家衣服图片base64
        //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //保存商家衣服商品数据到数据库
        String uuid= UUID.randomUUID().toString();//生成唯一值
        String clothImgRelativeUrl="images/business/cloth/"+uuid+"_"+accountNumber+".png";//商家衣服保存的相对路径image/business/cloth/uuid_账号.jpg
        String clothImgAbsoluteUrl=ImageApi.getImgAbsolutePath()+clothImgRelativeUrl;//商家衣服保存的绝对路径
        BusinessCloth businessCloth=new BusinessCloth();
        businessCloth.setBusinesser(userId);
        businessCloth.setCaption(caption);
        businessCloth.setPrice(price);
        businessCloth.setIntroduction(introduction);
        businessCloth.setImgUrl(clothImgRelativeUrl);

        int count= businessClothService.insertSelective(businessCloth);
        if(count!=1){
            return "{\"flat\":false}";
        }
        //保存商家衣服商品图片
        ImageApi.GenerateImage(shangjiaClothImgBase64,clothImgAbsoluteUrl);//保存图片
        return "{\"flat\":true}";
    }


    /**
     * Created by simple on 2017/03/01.
     * 上传商家logo
     * 上传成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/shangjiaUploadLogo_authority")
    public @ResponseBody String shangjiaUploadLogo(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        String caption=request.getParameter("caption");//logo标题
        String introduction=request.getParameter("introduction");//logo描述
        String shangjiaLogoImgBase64=request.getParameter("shangjiaLogoImg");//商家logo图片base64
        //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //保存商家logo数据到数据库
        String uuid= UUID.randomUUID().toString();//生成唯一值
        String logoImgRelativeUrl="images/business/logo/"+uuid+"_"+accountNumber+".png";//商家logo保存的相对路径image/business/logo/uuid_账号.jpg
        String logoImgAbsoluteUrl=ImageApi.getImgAbsolutePath()+logoImgRelativeUrl;//商家logo保存的绝对路径
        BusinessLogo businessLogo=new BusinessLogo();
        businessLogo.setBusinesser(userId);
        businessLogo.setCaption(caption);
        businessLogo.setIntroduction(introduction);
        businessLogo.setImgUrl(logoImgRelativeUrl);

        int count= businessLogoService.insertSelective(businessLogo);
        if(count!=1){
            return "{\"flat\":false}";
        }
        //保存商家衣服商品图片
        ImageApi.GenerateImage(shangjiaLogoImgBase64,logoImgAbsoluteUrl);//保存图片
        return "{\"flat\":true}";
    }

    /**
     * Created by simple on 2017/03/01.
     * 获得商城的衣服商品列表数据,无需登录
     * 返回衣服商品列表数据：List<BusinessCloth>
     */
    @RequestMapping("/getShangChengClothList")
    public @ResponseBody List<BusinessCloth> getShangChengClothList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer page=Integer.parseInt(request.getParameter("page"));
        List<BusinessCloth> businessClothList=businessClothService.selectListOnePage(page);

        return businessClothList;
    }

    /**
     * Created by simple on 2017/03/01.
     * 获得商城的logo列表数据,无需登录
     * 返回衣服商品列表数据：List<BusinessLogo>
     */
    @RequestMapping("/getShangChengLogoList")
    public @ResponseBody List<BusinessLogo> getShangChengLogoList(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer page=Integer.parseInt(request.getParameter("page"));
        List<BusinessLogo> businessLogoList=businessLogoService.selectListOnePage(page);

        return businessLogoList;
    }
    /**
     * Created by simple on 2017/03/17.
     * 保存用户从商城diy的衣服，需要登录
     * 返回衣服商品列表数据：List<BusinessCloth>
     */
    @RequestMapping("/saveDiyCloth_authority")
    public @ResponseBody String saveDiyCloth(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        String accountNumber=request.getParameter("accountNumber");//账号
        Integer businessClothId=Integer.parseInt(request.getParameter("businessClothId"));
        Integer logoId=Integer.parseInt(request.getParameter("logoId"));
        Integer isBusinessLogo=Integer.parseInt(request.getParameter("isBusinessLogo"));
        String diyImgBase64=request.getParameter("diyImgBase64");

        //通过账号获得userId,保存在user里
        User user=new User();
        user.setAccountNumber(accountNumber);
        user=userService.selectBySelective(user);
        int userId=user.getId();
        //保存图片
        String uuid=UUID.randomUUID().toString();
        String diyImgRelativeUrl="images/diyCloth/"+uuid+".png";
        String diyImgAbsoluteUrl=ImageApi.getImgAbsolutePath()+diyImgRelativeUrl;
        ImageApi.GenerateImage(diyImgBase64,diyImgAbsoluteUrl);

        MyDiyCloth myDiyCloth=new MyDiyCloth();
        myDiyCloth.setBusinessClothId(businessClothId);
        if(isBusinessLogo ==1){
            myDiyCloth.setIsBusinessLogo(true);
        }
        else {
            myDiyCloth.setIsBusinessLogo(false);
        }
        myDiyCloth.setUserId(userId);
        myDiyCloth.setLogoId(logoId);
        myDiyCloth.setDiyImgUrl(diyImgRelativeUrl);
        myDiyClothService.insertSelectiveReturnId(myDiyCloth);
        Integer myDiyClothId=myDiyCloth.getMyDiyClothId();
        return "{\"myDiyClothId\":\""+myDiyClothId+"\",\"imgUrl\":\""+diyImgRelativeUrl+"\"}";
    }

    /**
     * Created by simple on 2017/03/20.
     * 根据diyCloth的id获得diy衣服的详情,需要登录
     * 返回衣服商品列表数据：MyDiyClothVo
     */
    @RequestMapping("/getDiyClothDetails_authority")
    public @ResponseBody MyDiyClothVo getDiyClothDetails(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer myDiyClothId=Integer.parseInt(request.getParameter("myDiyClothId"));
        MyDiyClothVo myDiyClothVo=myDiyClothService.selectDiyClothDetailsByMyDiyClothId(myDiyClothId);
        return myDiyClothVo;
    }

    /**
     * Created by simple on 2017/03/22.
     * 商城订单支付   需要登录
     * 支付成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/shoppingMakeOrder_authority")
    public @ResponseBody String shoppingMakeOrder(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {

        Integer myDiyClothId= Integer.parseInt(request.getParameter("myDiyClothId"));//diy衣服的id
        Integer price= Integer.parseInt(request.getParameter("price"));//单间衣服的总价格（总价格=原价+logo价格）
        Integer clothCount= Integer.parseInt(request.getParameter("totalCount"));//总件数
        Integer totalPrice= Integer.parseInt(request.getParameter("totalPrice"));//总费用
        String clothSizeItems= request.getParameter("clothSizeItems");//尺码json字符串，需要转化为json格式才能操作

        //保存订单
        ShopOrders shopOrders = new ShopOrders();
        shopOrders.setIsPay(false);
        shopOrders.setMyDiyClothId(myDiyClothId);
        shopOrders.setCount(clothCount);
        shopOrders.setPrice(price);
        shopOrders.setTotalprice(totalPrice);
        int count = shopOrdersService.insertSelectiveReturnId(shopOrders);
        Integer shopOrdersId = shopOrders.getId();


        //保存订单详情
        ShopOrdersDetail shopOrdersDetail = new ShopOrdersDetail();
        shopOrdersDetail.setShopOrdersId(shopOrdersId);
        JSONArray jsonArray = JSONArray.fromObject(clothSizeItems);
        for(int i=0;i<jsonArray.size();i++){
            shopOrdersDetail.setSize(jsonArray.getJSONObject(i).getString("clothSize"));
            shopOrdersDetail.setCount(jsonArray.getJSONObject(i).getInt("quantity"));
            shopOrdersDetailService.insertSelective(shopOrdersDetail);
        }

        if(count==1)
        {
            return "{\"flat\":true}";
        }
        else{
            return "{\"flat\":false}";
        }
    }

    /**
     * Created by simple on 2017/03/22.
     * 商城订单支付   需要登录
     * 支付成功，返回{flat:true},否则返回{flat:false}
     */
    @RequestMapping("/saveAddressAndshoppingOrderPay_authority")
    public @ResponseBody String shoppingPay(HttpServletResponse response,HttpServletRequest request)
            throws IOException, NoSuchAlgorithmException {
        Integer userId= Integer.parseInt(request.getParameter("myDiyClothId"));
        Integer shopOrdersId= Integer.parseInt(request.getParameter("shopOrdersId"));
        String realName=request.getParameter("realName");
        String phoneNumber=request.getParameter("phoneNumber");
        String sheng=request.getParameter("sheng");
        String shi=request.getParameter("shi");
        String qu=request.getParameter("qu");
        String detailAddress=request.getParameter("detailAddress");
        String postalcode=request.getParameter("postalcode");


        //保存用户收货地址
        UserAddress userAddress=new UserAddress();
        userAddress.setSheng(sheng);
        userAddress.setShi(shi);
        userAddress.setQu(qu);
        userAddress.setDetailAddress(detailAddress);
        userAddress.setPostalcode(postalcode);
        userAddress.setRealName(realName);
        userAddress.setPhoneNumber(phoneNumber);
        userAddressService.insertSelectiveReturnId(userAddress);
        int userAddressId=userAddress.getUserAddressId();



        //为订单添加用户的收货地址，并设置订单的支付状态为已支付
        ShopOrders shopOrders=new ShopOrders();
        shopOrders.setIsPay(true);
        shopOrders.setUserAddressId(userAddressId);
        shopOrders.setId(shopOrdersId);

        int count=shopOrdersService.updateByPrimaryKeySelective(shopOrders);


        if(count==1)
        {
            return "{\"flat\":true}";
        }
        else{
            return "{\"flat\":false}";
        }
    }

}
