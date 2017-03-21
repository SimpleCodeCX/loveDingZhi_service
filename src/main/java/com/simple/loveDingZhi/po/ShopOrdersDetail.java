package com.simple.loveDingZhi.po;

public class ShopOrdersDetail {
    private Integer id;

    private Integer shopOrdersId;

    private String size;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopOrdersId() {
        return shopOrdersId;
    }

    public void setShopOrdersId(Integer shopOrdersId) {
        this.shopOrdersId = shopOrdersId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}