package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignDrawingImgMapper;
import com.simple.loveDingZhi.po.DesignDrawingImg;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignDrawingImgServiceImpl implements IDesignDrawingImgService{
    @Autowired
    private DesignDrawingImgMapper designDrawingImgMapper;
    public int insertSelective(DesignDrawingImg designDrawingImg) {
        return designDrawingImgMapper.insertSelective(designDrawingImg);
    }
}
