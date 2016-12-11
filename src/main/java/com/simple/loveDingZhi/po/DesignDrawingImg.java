package com.simple.loveDingZhi.po;

public class DesignDrawingImg {
    private Integer id;

    private Integer designDrawingId;

    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDesignDrawingId() {
        return designDrawingId;
    }

    public void setDesignDrawingId(Integer designDrawingId) {
        this.designDrawingId = designDrawingId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}