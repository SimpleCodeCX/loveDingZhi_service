package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.DesignerCertification;
import com.simple.loveDingZhi.po.DesignerCertificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerCertificationMapper {
    int countByExample(DesignerCertificationExample example);

    int deleteByExample(DesignerCertificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DesignerCertification record);

    int insertSelective(DesignerCertification record);

    List<DesignerCertification> selectByExample(DesignerCertificationExample example);

    DesignerCertification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DesignerCertification record, @Param("example") DesignerCertificationExample example);

    int updateByExample(@Param("record") DesignerCertification record, @Param("example") DesignerCertificationExample example);

    int updateByPrimaryKeySelective(DesignerCertification record);

    int updateByPrimaryKey(DesignerCertification record);
}