package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignDrawingImg;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public class TestIDesignDrawingService {
    @Test
    public void testSelectListOnePage(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignDrawingService designDrawingService=(IDesignDrawingService)applicationContext.getBean("designDrawingService");
        List<DesignDrawing> designDrawingList = designDrawingService.selectListOnePage(2);
    }
}
