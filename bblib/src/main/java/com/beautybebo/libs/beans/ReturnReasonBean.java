package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class ReturnReasonBean implements Serializable {
    Boolean status;
    String message;
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

    public ArrayList<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
         int id;
         String title;

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
    }

}
