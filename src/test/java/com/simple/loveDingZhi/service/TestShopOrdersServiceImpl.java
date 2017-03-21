package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.ShopOrders;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public class TestShopOrdersServiceImpl {
    @Test
    public void testSelectDiyClothDetailsByMyDiyClothId(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IShopOrdersService shopOrdersService=(IShopOrdersService)applicationContext.getBean("shopOrdersService");
        ShopOrders shopOrders = new ShopOrders();
        shopOrders.setIsPay(false);
        shopOrders.setMyDiyClothId(1);
        shopOrders.setCount(2);
        shopOrders.setPrice(2);
        shopOrders.setTotalprice(22);
        shopOrdersService.insertSelectiveReturnId(shopOrders);
        System.out.println("......");

    }
}
