package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class OrderBean implements Serializable {

    Boolean status;
    String message;
    ArrayList<InfoBean> info;
    int total_page;

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
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
        String order_prefix;
        String customer_name;
        String total;
        String payment_method;
        String created_date;
        String status;
        int total_items;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOrder_prefix() {
            return order_prefix;
        }

        public void setOrder_prefix(String order_prefix) {
            this.order_prefix = order_prefix;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getPayment_method() {
            return payment_method;
        }

        public void setPayment_method(String payment_method) {
            this.payment_method = payment_method;
        }

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getTotal_items() {
            return total_items;
        }

        public void setTotal_items(int total_items) {
            this.total_items = total_items;
        }
    }
}
