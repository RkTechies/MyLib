package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class CategoryInfoBean implements Serializable {
    Boolean status;
    String message;
    InfoBean info;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
        int id;
        String title;
        String url_key;
        String description;
        Boolean isSelected=false;
        ArrayList<String> images;
        ArrayList<InfoBean> childs;

        public Boolean getSelected() {
            return isSelected;
        }

        public void setSelected(Boolean selected) {
            isSelected = selected;
        }

        public ArrayList<InfoBean> getChilds() {
            return childs;
        }

        public void setChilds(ArrayList<InfoBean> childs) {
            this.childs = childs;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl_key() {
            return url_key;
        }

        public void setUrl_key(String url_key) {
            this.url_key = url_key;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ArrayList<String> getImages() {
            return images;
        }

        public void setImages(ArrayList<String> images) {
            this.images = images;
        }
    }
}
