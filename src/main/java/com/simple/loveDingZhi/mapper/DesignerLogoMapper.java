package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignerLogo;
import com.simple.loveDingZhi.po.DesignerLogoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DesignerLogoMapper {
    int countByExample(DesignerLogoExample example);

    int deleteByExample(DesignerLogoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignerLogo record);

    int insertSelective(DesignerLogo record);

    List<DesignerLogo> selectByExampleWithBLOBs(DesignerLogoExample example);

    List<DesignerLogo> selectByExample(DesignerLogoExample example);

    DesignerLogo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByExampleWithBLOBs(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByExample(@Param("record") DesignerLogo record, @Param("example") DesignerLogoExample example);

    int updateByPrimaryKeySelective(DesignerLogo record);

    int updateByPrimaryKeyWithBLOBs(DesignerLogo record);

    int updateByPrimaryKey(DesignerLogo record);
}