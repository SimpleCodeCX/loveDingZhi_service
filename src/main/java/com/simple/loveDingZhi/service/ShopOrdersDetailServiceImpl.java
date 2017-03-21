package com.simple.loveDingZhi.service;

import com.simple.loveDingZhi.mapper.ShopOrdersDetailMapper;
import com.simple.loveDingZhi.po.ShopOrdersDetail;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by uidp5344 on 2017/3/21.
 */
public class ShopOrdersDetailServiceImpl implements IShopOrdersDetailService {
    @Autowired
    private ShopOrdersDetailMapper shopOrdersDetailMapper;
    public int insertSelective(ShopOrdersDetail shopOrdersDetail) {
        return shopOrdersDetailMapper.insertSelective(shopOrdersDetail);
    }
}
