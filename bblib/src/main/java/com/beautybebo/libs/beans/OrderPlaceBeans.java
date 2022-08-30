package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class OrderPlaceBeans implements Serializable {
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
        String order_prefix;
        String order_id;
        String amount;

        public String getOrder_prefix() {
            return order_prefix;
        }

        public void setOrder_prefix(String order_prefix) {
            this.order_prefix = order_prefix;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }

}
