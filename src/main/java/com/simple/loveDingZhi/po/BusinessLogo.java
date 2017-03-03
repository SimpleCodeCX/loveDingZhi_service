package com.simple.loveDingZhi.po;

public class BusinessLogo {
    private Integer id;

    private String caption;

    private String imgUrl;

    private Integer businesser;

    private String introduction;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getBusinesser() {
        return businesser;
    }

    public void setBusinesser(Integer businesser) {
        this.businesser = businesser;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}