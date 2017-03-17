package com.simple.loveDingZhi.po;

import java.util.Date;

public class ShopOrders {
    private Integer id;

    private Integer orderDetailId;

    private Integer myDiyClothId;

    private Integer price;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getMyDiyClothId() {
        return myDiyClothId;
    }

    public void setMyDiyClothId(Integer myDiyClothId) {
        this.myDiyClothId = myDiyClothId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}