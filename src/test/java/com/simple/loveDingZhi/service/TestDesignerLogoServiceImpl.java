package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public class TestDesignerLogoServiceImpl {
    @Test
    public void testSelectListByUserName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignerLogoService designerLogoService=(IDesignerLogoService)applicationContext.getBean("designerLogoService");
        designerLogoService.selectListByUserName("simple");

    }
}
