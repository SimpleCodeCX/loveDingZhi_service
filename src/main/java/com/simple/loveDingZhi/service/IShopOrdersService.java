package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.po.ShopOrders;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public interface IShopOrdersService {
    public int updateByPrimaryKeySelective(ShopOrders shopOrders);
    public int insertSelective(ShopOrders shopOrders);
    public int insertSelectiveReturnId(ShopOrders shopOrders );
}
