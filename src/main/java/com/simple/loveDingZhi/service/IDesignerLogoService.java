package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignDrawing;

import java.util.List;

/**
 * Created by simple on 2017/2/5.
 */
public interface IDesignerLogoService {
    List<DesignDrawing> selectListByUserName(String userName);//根据用户名获得用户的logo列表
}
