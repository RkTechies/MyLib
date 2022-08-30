package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.List;

public class HomeBean implements Serializable {
    Boolean status;
    String type;
    int cartCount;
    String message;
    List<InfoBean> info;

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        String title;
        String sub_title;
        String type;
        String column_type;
        String isMeta;
        List<InfoMetaBean> meta;

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

        public String getSub_title() {
            return sub_title;
        }

        public void setSub_title(String sub_title) {
            this.sub_title = sub_title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getColumn_type() {
            return column_type;
        }

        public void setColumn_type(String column_type) {
            this.column_type = column_type;
        }

        public String getIsMeta() {
            return isMeta;
        }

        public void setIsMeta(String isMeta) {
            this.isMeta = isMeta;
        }

        public List<InfoMetaBean> getMeta() {
            return meta;
        }

        public void setMeta(List<InfoMetaBean> meta) {
            this.meta = meta;
        }
    }

    public static class InfoMetaBean implements Serializable {
        int id;
        String home_id;
        String title;
        String image;
        String action_page;
        String item_id;
        String slug;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getHome_id() {
            return home_id;
        }

        public void setHome_id(String home_id) {
            this.home_id = home_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getAction_page() {
            return action_page;
        }

        public void setAction_page(String action_page) {
            this.action_page = action_page;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }
    }

}
