package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignDrawingMapper;
import com.simple.loveDingZhi.po.DesignDrawing;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignDrawingServiceImpl implements IDesignDrawingService{
    @Autowired
    private DesignDrawingMapper designDrawingMapper;
    public int insertSelectiveReturnId(DesignDrawing designDrawing) {
        return designDrawingMapper.insertSelectiveReturnId(designDrawing);
    }
    public DesignDrawing selectByPrimaryKey(Integer id) {
        return designDrawingMapper.selectByPrimaryKey(id);
    }
}
