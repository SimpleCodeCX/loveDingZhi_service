package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerCertificationMapper;
import com.simple.loveDingZhi.po.DesignerCertification;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by simple on 2016/12/9.
 */
public class DesignerCertificationServiceImpl implements IDesignerCertificationService {
    @Autowired
    private DesignerCertificationMapper designerCertificationMapper;

    public int insertSelective(DesignerCertification designerCertification) {
        return designerCertificationMapper.insertSelective(designerCertification);
    }
    public DesignerCertification selectByPrimaryKey(Integer id){
        return designerCertificationMapper.selectByPrimaryKey(id);
    }
}
