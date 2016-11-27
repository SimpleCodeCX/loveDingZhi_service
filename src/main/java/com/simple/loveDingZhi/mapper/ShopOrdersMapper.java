package com.simple.loveDingZhi.mapper;

import com.simple.loveDingZhi.po.ShopOrders;
import com.simple.loveDingZhi.po.ShopOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopOrdersMapper {
    int countByExample(ShopOrdersExample example);

    int deleteByExample(ShopOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrders record);

    int insertSelective(ShopOrders record);

    List<ShopOrders> selectByExample(ShopOrdersExample example);

    ShopOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrders record, @Param("example") ShopOrdersExample example);

    int updateByExample(@Param("record") ShopOrders record, @Param("example") ShopOrdersExample example);

    int updateByPrimaryKeySelective(ShopOrders record);

    int updateByPrimaryKey(ShopOrders record);
}