package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.Designer;
import com.simple.loveDingZhi.po.DesignerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesignerMapper {
    int countByExample(DesignerExample example);

    int deleteByExample(DesignerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Designer record);

    int insertSelective(Designer record);

    List<Designer> selectByExampleWithBLOBs(DesignerExample example);

    List<Designer> selectByExample(DesignerExample example);

    Designer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExampleWithBLOBs(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByExample(@Param("record") Designer record, @Param("example") DesignerExample example);

    int updateByPrimaryKeySelective(Designer record);

    int updateByPrimaryKeyWithBLOBs(Designer record);

    int updateByPrimaryKey(Designer record);
}