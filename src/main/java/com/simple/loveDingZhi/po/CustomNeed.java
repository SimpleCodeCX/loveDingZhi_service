package com.simple.loveDingZhi.po;

import java.util.Date;

public class CustomNeed {
    private Integer id;

    private String caption;

    private Integer designer;

    private Integer price;

    private Date date;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public Integer getDesigner() {
        return designer;
    }

    public void setDesigner(Integer designer) {
        this.designer = designer;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}