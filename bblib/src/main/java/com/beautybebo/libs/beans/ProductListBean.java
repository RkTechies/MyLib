package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductListBean implements Serializable {
    Boolean status;
    String message;
    int total_page;
    ArrayList<InfoBean> info;

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

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

    public ArrayList<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
        int id;
        int qty;
        int totalRatings;
        int stock_status;
        String url_key;
        String type;
        String name;
        String product_image;
        String productRatings;
        String regular_price;
        String sale_price;
        String discount;
        Boolean isWishlist=false;

        public String getType() {
            return type;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getWishlist() {
            return isWishlist;
        }

        public void setWishlist(Boolean wishlist) {
            isWishlist = wishlist;
        }

        public int getTotalRatings() {
            return totalRatings;
        }

        public void setTotalRatings(int totalRatings) {
            this.totalRatings = totalRatings;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public int getStock_status() {
            return stock_status;
        }

        public void setStock_status(int stock_status) {
            this.stock_status = stock_status;
        }

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
