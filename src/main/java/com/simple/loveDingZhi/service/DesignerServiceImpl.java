package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerMapper;
import com.simple.loveDingZhi.po.Designer;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignerServiceImpl implements IDesignerService {
    @Autowired
    DesignerMapper designerMapper;
    public int insertSelective(Designer designer) {
        return designerMapper.insertSelective(designer);
    }
    public  int updateCountByUserId(int userId){
        return designerMapper.updateCountByUserId(userId);
    }
}
