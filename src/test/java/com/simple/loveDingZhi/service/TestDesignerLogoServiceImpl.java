package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;
import com.simple.loveDingZhi.po.DesignerLogo;
import com.simple.loveDingZhi.po.DesignerLogoVo;
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
        List<DesignerLogo>designerLogoList= designerLogoService.selectListByUserName("simple");

    }
    @Test
    public void TestSelectListOnePage(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignerLogoService designerLogoService=(IDesignerLogoService)applicationContext.getBean("designerLogoService");
        List<DesignerLogo>designerLogoList= designerLogoService.selectListOnePage(1);
    }
    @Test
    public void TestSelectDesignerLogoDetailsByDesignerLogoId(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        IDesignerLogoService designerLogoService=(IDesignerLogoService)applicationContext.getBean("designerLogoService");
        DesignerLogoVo designerLogoVo=designerLogoService.selectDesignerLogoDetailsByDesignerLogoId(1);
    }
}
