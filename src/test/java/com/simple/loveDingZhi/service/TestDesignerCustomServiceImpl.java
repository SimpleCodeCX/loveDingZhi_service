package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignerCustom;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public class TestDesignerCustomServiceImpl {
    @Test
    public void testInsertSelective(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignerCustomService designerCustomService=(IDesignerCustomService)applicationContext.getBean("designerCustomService");

        List<DesignerCustom> designerCustomList=designerCustomService.selectDesignerList();
        System.out.println("1");
    }
}
