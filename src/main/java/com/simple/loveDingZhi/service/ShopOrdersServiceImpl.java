package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.ShopOrdersMapper;
import com.simple.loveDingZhi.po.ShopOrders;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public class ShopOrdersServiceImpl implements IShopOrdersService {
    @Autowired
    private ShopOrdersMapper shopOrdersMapper;

    public int updateByPrimaryKeySelective(ShopOrders shopOrders) {
        return shopOrdersMapper.updateByPrimaryKeySelective(shopOrders);
    }

    public int insertSelective(ShopOrders shopOrders) {
        return shopOrdersMapper.insertSelective(shopOrders);
    }

    public int insertSelectiveReturnId(ShopOrders shopOrders) {
        return shopOrdersMapper.insertSelectiveReturnId(shopOrders);
    }
}
