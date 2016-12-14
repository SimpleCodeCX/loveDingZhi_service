package com.simple.loveDingZhi.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by simple on 2016/12/11.
 */
public class TestDesignerServiceImpl {
    @Test
    public void testSelectDesignerDetailsByUserId(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignerService designerService=(IDesignerService)applicationContext.getBean("designerService");
        System.out.println(designerService.selectDesignerDetailsByUserId(263).getDesignDrawingExtendList().size());
        System.out.println(designerService.selectDesignerDetailsByUserId(263).getUser().getId());
    }
}
