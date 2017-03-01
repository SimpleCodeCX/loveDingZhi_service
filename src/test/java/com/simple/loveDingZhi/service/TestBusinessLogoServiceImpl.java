package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.BusinessLogo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by uidp5344 on 2017/3/1.
 */
public class TestBusinessLogoServiceImpl {
    @Test
    public void testSelectListOnePage(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IBusinessLogoService businessLogoService=(IBusinessLogoService)applicationContext.getBean("businessLogoService");
        List<BusinessLogo> businessLogoList=businessLogoService.selectListOnePage(1);
        System.out.println("......");
    }
    @Test
    public void testSelectListByUserName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IBusinessLogoService businessLogoService=(IBusinessLogoService)applicationContext.getBean("businessLogoService");
        List<BusinessLogo> businessLogoList=businessLogoService.selectListByUserName("7");
        System.out.println("......");
    }
}
