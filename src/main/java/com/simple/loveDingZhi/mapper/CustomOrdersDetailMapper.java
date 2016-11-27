package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.CustomOrdersDetail;
import com.simple.loveDingZhi.po.CustomOrdersDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomOrdersDetailMapper {
    int countByExample(CustomOrdersDetailExample example);

    int deleteByExample(CustomOrdersDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomOrdersDetail record);

    int insertSelective(CustomOrdersDetail record);

    List<CustomOrdersDetail> selectByExample(CustomOrdersDetailExample example);

    CustomOrdersDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomOrdersDetail record, @Param("example") CustomOrdersDetailExample example);

    int updateByExample(@Param("record") CustomOrdersDetail record, @Param("example") CustomOrdersDetailExample example);

    int updateByPrimaryKeySelective(CustomOrdersDetail record);

    int updateByPrimaryKey(CustomOrdersDetail record);
}