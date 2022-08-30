package com.beautybebo.libs.beans;

import java.io.Serializable;

public class LoginBean implements Serializable {
    Boolean status;
    int type;
    int cartCount;
    String message;
    String time;
    UserBean info;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public UserBean getInfo() {
        return info;
    }

    public void setInfo(UserBean info) {
        this.info = info;
    }


}
