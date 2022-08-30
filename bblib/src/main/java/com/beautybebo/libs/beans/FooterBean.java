package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.List;

public class FooterBean implements Serializable {
    String link;
    String title;
    String img;
    Integer image;
    String id;
    public FooterBean() {
    }

    public FooterBean(String link, String title, String img, String id) {
        this.link = link;
        this.title = title;
        this.img = img;
        this.id = id;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
