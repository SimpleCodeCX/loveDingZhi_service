package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignDrawingImg;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by simple on 2016/12/11.
 */
public class TestDesignDrawingImgServiceImpl {
    @Test
    public void testInsertSelective(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignDrawingImgService designDrawingImgService=(IDesignDrawingImgService)applicationContext.getBean("designDrawingImgService");
        DesignDrawingImg designDrawingImg=new DesignDrawingImg();
        designDrawingImg.setDesignDrawingId(1);
        designDrawingImg.setImgUrl("url");
        designDrawingImgService.insertSelective(designDrawingImg);
    }
}
