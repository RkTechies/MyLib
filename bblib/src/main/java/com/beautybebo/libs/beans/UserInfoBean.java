package com.beautybebo.libs.beans;

import com.beautybebo.libs.beans.UserBean;

import java.io.Serializable;

public class UserInfoBean implements Serializable {
    Boolean status;
    int type;
    String message;
    UserBean info;

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

    public UserBean getInfo() {
        return info;
    }

    public void setInfo(UserBean info) {
        this.info = info;
    }
}
