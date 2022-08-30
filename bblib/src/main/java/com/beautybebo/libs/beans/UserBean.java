package com.beautybebo.libs.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
    String token;
    int id;
    String first_name;
    String last_name;
    String phone;
    String email;
    String image;
    String customer_group;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCustomer_group() {
        return customer_group;
    }

    public void setCustomer_group(String customer_group) {
        this.customer_group = customer_group;
    }
}
