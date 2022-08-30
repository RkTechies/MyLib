package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchBean implements Serializable {
    Boolean status;
    String message;
    ArrayList<InfoBean> info;
    ArrayList<CatBean> categories;

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

    public ArrayList<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<InfoBean> info) {
        this.info = info;
    }

    public ArrayList<CatBean> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<CatBean> categories) {
        this.categories = categories;
    }

    public static class CatBean implements Serializable {
        String title;
        String url_key;

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
    }

    public static class InfoBean implements Serializable {
        String url_key;
        String name;
        String product_image;
        String productRatings;
        String regular_price;
        String sale_price;

        public String getUrl_key() {
            return url_key;
        }

        public void setUrl_key(String url_key) {
            this.url_key = url_key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProduct_image() {
            return product_image;
        }

        public void setProduct_image(String product_image) {
            this.product_image = product_image;
        }

        public String getProductRatings() {
            return productRatings;
        }

        public void setProductRatings(String productRatings) {
            this.productRatings = productRatings;
        }

        public String getRegular_price() {
            return regular_price;
        }

        public void setRegular_price(String regular_price) {
            this.regular_price = regular_price;
        }

        public String getSale_price() {
            return sale_price;
        }

        public void setSale_price(String sale_price) {
            this.sale_price = sale_price;
        }
    }
}
