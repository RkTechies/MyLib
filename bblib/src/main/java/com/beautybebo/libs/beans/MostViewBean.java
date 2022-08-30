package com.beautybebo.libs.beans;

import java.io.Serializable;

public class MostViewBean implements Serializable {
    Boolean status;
    String message;

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

}
