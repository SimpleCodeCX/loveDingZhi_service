package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.CustomNeed;
import com.simple.loveDingZhi.po.CustomNeedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomNeedMapper {
    int countByExample(CustomNeedExample example);

    int deleteByExample(CustomNeedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomNeed record);

    int insertSelective(CustomNeed record);

    List<CustomNeed> selectByExampleWithBLOBs(CustomNeedExample example);

    List<CustomNeed> selectByExample(CustomNeedExample example);

    CustomNeed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomNeed record, @Param("example") CustomNeedExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomNeed record, @Param("example") CustomNeedExample example);

    int updateByExample(@Param("record") CustomNeed record, @Param("example") CustomNeedExample example);

    int updateByPrimaryKeySelective(CustomNeed record);

    int updateByPrimaryKeyWithBLOBs(CustomNeed record);

    int updateByPrimaryKey(CustomNeed record);
}