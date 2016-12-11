package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.DesignerCustomMapper;
import com.simple.loveDingZhi.po.DesignerCustom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public class DesignerCustomServiceImpl implements IDesignerCustomService {
    @Autowired
    DesignerCustomMapper designerCustomMapper;
    public List<DesignerCustom> selectDesignerList() {
        return designerCustomMapper.selectDesignerList();
    }
}
