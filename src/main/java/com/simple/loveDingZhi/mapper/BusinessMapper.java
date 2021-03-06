package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.Business;
import com.simple.loveDingZhi.po.BusinessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessMapper {
    int countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExampleWithBLOBs(BusinessExample example);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExampleWithBLOBs(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKeyWithBLOBs(Business record);

    int updateByPrimaryKey(Business record);
}