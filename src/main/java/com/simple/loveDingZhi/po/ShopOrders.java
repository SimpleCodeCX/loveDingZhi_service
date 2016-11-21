package com.simple.loveDingZhi.po;

import java.util.Date;

public class ShopOrders {
    private Integer id;

    private Integer orderDetailId;

    private Integer bussinessClothId;

    private Integer businessLogoId;

    private String diyImgUrl;

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

    public Integer getBussinessClothId() {
        return bussinessClothId;
    }

    public void setBussinessClothId(Integer bussinessClothId) {
        this.bussinessClothId = bussinessClothId;
    }

    public Integer getBusinessLogoId() {
        return businessLogoId;
    }

    public void setBusinessLogoId(Integer businessLogoId) {
        this.businessLogoId = businessLogoId;
    }

    public String getDiyImgUrl() {
        return diyImgUrl;
    }

    public void setDiyImgUrl(String diyImgUrl) {
        this.diyImgUrl = diyImgUrl == null ? null : diyImgUrl.trim();
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