package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class CartActionBean implements Serializable {
    Boolean status;
    String message;
    int cartCount;
    ArrayList<CartBean.InfoBean> info;
    ArrayList<CartBean.TotalBean> totals;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<CartBean.InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<CartBean.InfoBean> info) {
        this.info = info;
    }

    public ArrayList<CartBean.TotalBean> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<CartBean.TotalBean> totals) {
        this.totals = totals;
    }
}
