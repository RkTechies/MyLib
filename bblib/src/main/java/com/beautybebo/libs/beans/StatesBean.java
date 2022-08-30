package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class StatesBean implements Serializable {
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
        String name;
        String isoCode;
        String countryCode;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIsoCode() {
            return isoCode;
        }

        public void setIsoCode(String isoCode) {
            this.isoCode = isoCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }
    }

}
