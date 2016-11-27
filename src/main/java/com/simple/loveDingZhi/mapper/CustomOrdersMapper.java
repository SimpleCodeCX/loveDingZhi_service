package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.CustomOrders;
import com.simple.loveDingZhi.po.CustomOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomOrdersMapper {
    int countByExample(CustomOrdersExample example);

    int deleteByExample(CustomOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomOrders record);

    int insertSelective(CustomOrders record);

    List<CustomOrders> selectByExample(CustomOrdersExample example);

    CustomOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomOrders record, @Param("example") CustomOrdersExample example);

    int updateByExample(@Param("record") CustomOrders record, @Param("example") CustomOrdersExample example);

    int updateByPrimaryKeySelective(CustomOrders record);

    int updateByPrimaryKey(CustomOrders record);
}