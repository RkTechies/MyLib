package com.beautybebo.libs.beans;


import java.io.Serializable;

public class ProfileBean implements Serializable {
    String strTitle;
    String strSubTitle;
    Integer img;
    int intId;
    int intType;

    public ProfileBean() {
    }

    public ProfileBean(String strTitle, String strSubTitle, Integer img, int intId, int intType) {
        this.strTitle = strTitle;
        this.strSubTitle = strSubTitle;
        this.img = img;
        this.intId = intId;
        this.intType = intType;
    }

    public int getIntType() {
        return intType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }

    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public String getStrSubTitle() {
        return strSubTitle;
    }

    public void setStrSubTitle(String strSubTitle) {
        this.strSubTitle = strSubTitle;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }
}
