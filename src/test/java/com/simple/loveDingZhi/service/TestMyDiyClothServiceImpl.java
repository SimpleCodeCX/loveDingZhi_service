package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.MyDiyCloth;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by uidp5344 on 2017/3/17.
 */
public class TestMyDiyClothServiceImpl {
    @Test
    public void testSelectListByUserName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IMyDiyClothService myDiyClothService=(IMyDiyClothService)applicationContext.getBean("myDiyClothService");
        MyDiyCloth myDiyCloth=new MyDiyCloth();
        myDiyCloth.setBusinessClothId(1);
        myDiyCloth.setIsBusinessLogo(false);

        myDiyCloth.setLogoId(1);
        myDiyCloth.setDiyImgUrl("222");
        myDiyClothService.insertSelectiveReturnId(myDiyCloth);
        System.out.println("......");
    }
    @Test
    public void testSelectDiyClothDetailsByMyDiyClothId(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IMyDiyClothService myDiyClothService=(IMyDiyClothService)applicationContext.getBean("myDiyClothService");
        MyDiyCloth myDiyCloth= myDiyClothService.selectDiyClothDetailsByMyDiyClothId(50);
        System.out.println("......");
    }
}
