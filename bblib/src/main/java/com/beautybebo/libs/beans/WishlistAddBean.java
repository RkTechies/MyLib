package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class WishlistAddBean implements Serializable {
    Boolean status;
    String message;
    int count;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
