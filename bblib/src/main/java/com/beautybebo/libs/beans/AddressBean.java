package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class AddressBean implements Serializable {
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
        Boolean isSelected=false;
        int id;
        int is_default;
        String title;
        String customer_name;
        String first_name;
        String last_name;
        String address_type;
        String address;
        String country;
        String state;
        String city;
        String zip_code;
        String phone;
        String alternate_phone;
        String state_code;

        public String getState_code() {
            return state_code;
        }

        public void setState_code(String state_code) {
            this.state_code = state_code;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAlternate_phone() {
            return alternate_phone;
        }

        public void setAlternate_phone(String alternate_phone) {
            this.alternate_phone = alternate_phone;
        }

        public Boolean getSelected() {
            return isSelected;
        }

        public void setSelected(Boolean selected) {
            isSelected = selected;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getAddress_type() {
            return address_type;
        }

        public void setAddress_type(String address_type) {
            this.address_type = address_type;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZip_code() {
            return zip_code;
        }

        public void setZip_code(String zip_code) {
            this.zip_code = zip_code;
        }
    }

}
