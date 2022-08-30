package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class AddReviewsBean implements Serializable {
    Boolean status;
    String message;
    int rating_id =0;

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

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }
}
