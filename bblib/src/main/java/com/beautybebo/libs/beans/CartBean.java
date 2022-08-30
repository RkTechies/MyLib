package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class CartBean implements Serializable {
    Boolean status;
    String message;
    int isOK;
    int cart_count;
    ArrayList<InfoBean> info;
    ArrayList<TotalBean> totals;

    public int getIsOK() {
        return isOK;
    }

    public void setIsOK(int isOK) {
        this.isOK = isOK;
    }

    public int getCartCount() {
        return cart_count;
    }

    public void setCartCount(int cartCount) {
        this.cart_count = cartCount;
    }

    public int getCart_count() {
        return cart_count;
    }

    public void setCart_count(int cart_count) {
        this.cart_count = cart_count;
    }

    public ArrayList<TotalBean> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<TotalBean> totals) {
        this.totals = totals;
    }

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

    public static class InfoBean implements Serializable {
        int id;
        int product_id;
        int quantity;
        int is_addons;
        int parent_id;
        int qty;
        String msg;
        String sku;
        String url_key;
        String name;
        int min_qty;
        int max_qty;
        String product_image;
        String addons_data;
        String attributes_data;
        String regular_price;
        String sale_price;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getIs_addons() {
            return is_addons;
        }

        public void setIs_addons(int is_addons) {
            this.is_addons = is_addons;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
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

        public int getMin_qty() {
            return min_qty;
        }

        public void setMin_qty(int min_qty) {
            this.min_qty = min_qty;
        }

        public int getMax_qty() {
            return max_qty;
        }

        public void setMax_qty(int max_qty) {
            this.max_qty = max_qty;
        }

        public String getProduct_image() {
            return product_image;
        }

        public void setProduct_image(String product_image) {
            this.product_image = product_image;
        }

        public String getAddons_data() {
            return addons_data;
        }

        public void setAddons_data(String addons_data) {
            this.addons_data = addons_data;
        }

        public String getAttributes_data() {
            return attributes_data;
        }

        public void setAttributes_data(String attributes_data) {
            this.attributes_data = attributes_data;
        }
    }

    public static class TotalBean implements Serializable {
        int id;
        String title;
        String value;
        String value1;

        public String getValue1() {
            return value1;
        }

        public void setValue1(String value1) {
            this.value1 = value1;
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

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
