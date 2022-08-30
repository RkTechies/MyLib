package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.List;

public class CategoryBeans implements Serializable {
    Boolean status;
    String message;
    List<InfoBean> info;

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

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
        int id;
        int parent_category;
        int child_count;
        String title;
        String url_key;
        String image;
        Boolean isExpended=false;
        List<InfoBean> children;

        public InfoBean() {
        }

        public InfoBean(int id, int parent_category, String title, String url_key, String image, Boolean isExpended, List<InfoBean> children,int child_count) {
            this.id = id;
            this.child_count = child_count;
            this.parent_category = parent_category;
            this.title = title;
            this.url_key = url_key;
            this.image = image;
            this.isExpended = isExpended;
            this.children = children;
        }

        public int getChild_count() {
            return child_count;
        }

        public void setChild_count(int child_count) {
            this.child_count = child_count;
        }

        public Boolean getExpended() {
            return isExpended;
        }

        public void setExpended(Boolean expended) {
            isExpended = expended;
        }

        public List<InfoBean> getChildren() {
            return children;
        }

        public void setChildren(List<InfoBean> children) {
            this.children = children;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParent_category() {
            return parent_category;
        }

        public void setParent_category(int parent_category) {
            this.parent_category = parent_category;
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

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
