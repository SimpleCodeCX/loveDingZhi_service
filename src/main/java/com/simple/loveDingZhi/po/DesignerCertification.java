package com.simple.loveDingZhi.po;

public class DesignerCertification {
    private Integer id;

    private String eduLevel;

    private String schollName;

    private String major;

    private String majorCertificationUrl;

    private String worksUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel == null ? null : eduLevel.trim();
    }

    public String getSchollName() {
        return schollName;
    }

    public void setSchollName(String schollName) {
        this.schollName = schollName == null ? null : schollName.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getMajorCertificationUrl() {
        return majorCertificationUrl;
    }

    public void setMajorCertificationUrl(String majorCertificationUrl) {
        this.majorCertificationUrl = majorCertificationUrl == null ? null : majorCertificationUrl.trim();
    }

    public String getWorksUrl() {
        return worksUrl;
    }

    public void setWorksUrl(String worksUrl) {
        this.worksUrl = worksUrl == null ? null : worksUrl.trim();
    }
}