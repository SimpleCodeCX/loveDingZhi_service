package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.DesignerCertification;

/**
 * Created by simple on 2016/12/9.
 */
public interface IDesignerCertificationService {
    public int insertSelective(DesignerCertification designerCertification_);
    public DesignerCertification selectByPrimaryKey(Integer id_);
}
