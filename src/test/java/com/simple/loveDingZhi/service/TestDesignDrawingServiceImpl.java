package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by simple on 2016/12/11.
 */
public class TestDesignDrawingServiceImpl {
    @Test
    public void testInsertSelective(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignDrawingService designDrawingService=(IDesignDrawingService)applicationContext.getBean("designDrawingService");
        DesignDrawing designDrawing=new DesignDrawing();
        designDrawing.setCaption("1");
        designDrawing.setAuthor(123);
        designDrawing.setIntroduction("123");
        designDrawingService.insertSelectiveReturnId(designDrawing);
        System.out.println(designDrawing.getId());
    }
}
