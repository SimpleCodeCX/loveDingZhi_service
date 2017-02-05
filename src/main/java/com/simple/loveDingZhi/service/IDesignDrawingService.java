package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public interface IDesignDrawingService {
    public int insertSelectiveReturnId(DesignDrawing designDrawing);
    public DesignDrawing selectByPrimaryKey(Integer id);
    public List<DesignDrawing> selectListOnePage(int page);
    public List<DesignDrawing> selectListByUserName(String userName);//根据用户名获得用户的设计稿列表
}
