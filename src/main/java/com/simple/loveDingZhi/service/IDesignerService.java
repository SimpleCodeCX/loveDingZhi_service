package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.Designer;
import com.simple.loveDingZhi.po.DesignerCustom;
import com.simple.loveDingZhi.po.DesignerVo;

import java.util.List;

/**
 * Created by simple on 2016/12/11.
 */
public interface IDesignerService {
    public int insertSelective(Designer designer);
    public  int updateCountByUserId(int userId);
    public List<DesignerCustom> selectDesignerList();
    public DesignerVo selectDesignerDetailsByUserId(Integer userId);
}
