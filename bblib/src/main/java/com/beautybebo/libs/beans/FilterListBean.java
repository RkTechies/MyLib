package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class FilterListBean implements Serializable {
    Boolean status;
    String message;
    int total_page;
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

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
    }

    public ArrayList<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
       public int id;
        public  String name;
        public  String code;
        public String type;
        public float max;
        public float min;
        public int mCount=0;
        public  int isSelected=0;
        public   ArrayList<InfoValuesBean> values;

        public int getIsSelected() {
            return isSelected;
        }

        public void setIsSelected(int isSelected) {
            this.isSelected = isSelected;
        }

        public int getmCount() {
            return mCount;
        }

        public void setmCount(int mCount) {
            this.mCount = mCount;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ArrayList<InfoValuesBean> getValues() {
            return values;
        }

        public void setValues(ArrayList<InfoValuesBean> values) {
            this.values = values;
        }
    }

    public static class InfoValuesBean implements Serializable {
        int id;
        String url_key;
        String attr_label;
        String attr_image;
        String attr_value;
        int isSelected=0;

        public String getAttr_image() {
            return attr_image;
        }

        public void setAttr_image(String attr_image) {
            this.attr_image = attr_image;
        }

        public int getIsSelected() {
            return isSelected;
        }

        public void setIsSelected(int isSelected) {
            this.isSelected = isSelected;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUrl_key() {
            return url_key;
        }

        public void setUrl_key(String url_key) {
            this.url_key = url_key;
        }

        public String getAttr_label() {
            return attr_label;
        }

        public void setAttr_label(String attr_label) {
            this.attr_label = attr_label;
        }

        public String getAttr_value() {
            return attr_value;
        }

        public void setAttr_value(String attr_value) {
            this.attr_value = attr_value;
        }
    }
}
