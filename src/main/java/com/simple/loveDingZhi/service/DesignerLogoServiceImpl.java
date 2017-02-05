package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerLogoMapper;
import com.simple.loveDingZhi.po.DesignDrawing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public class DesignerLogoServiceImpl implements IDesignerLogoService{
    @Autowired
    private DesignerLogoMapper designerLogoMapper;
    public List<DesignDrawing> selectListByUserName(String userName) {
        return designerLogoMapper.selectListByUserName(userName);
    }
}
