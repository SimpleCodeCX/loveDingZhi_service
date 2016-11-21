package com.simple.loveDingZhi.po;

import java.util.Date;

public class CustomOrders {
    private Integer id;

    private Integer orderDetailId;

    private Integer designDrawingId;

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

    public Integer getDesignDrawingId() {
        return designDrawingId;
    }

    public void setDesignDrawingId(Integer designDrawingId) {
        this.designDrawingId = designDrawingId;
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