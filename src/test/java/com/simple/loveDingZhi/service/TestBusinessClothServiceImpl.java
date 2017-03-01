package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.BusinessCloth;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class TestBusinessClothServiceImpl {
    @Test
    public void testSelectListOnePage(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IBusinessClothService businessClothService=(IBusinessClothService)applicationContext.getBean("businessClothService");
        List<BusinessCloth> businessClothList=businessClothService.selectListOnePage(1);
        System.out.println("......");
    }
    @Test
    public void testSelectListByUserName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IBusinessClothService businessClothService=(IBusinessClothService)applicationContext.getBean("businessClothService");
        List<BusinessCloth> businessClothList=businessClothService.selectListByUserName("8");
        System.out.println("......");
    }
}
