package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.Designer;

/**
 * Created by simple on 2016/12/11.
 */
public interface IDesignerService {
    public int insertSelective(Designer designer);
    public  int updateCountByUserId(int userId);
}
