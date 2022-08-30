package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductReviewsBean implements Serializable {
    Boolean status;
    String message;
    int total_page;
    AvgRatingBean avg_ratings;
    ArrayList<InfoBean> info;

    public AvgRatingBean getAvg_ratings() {
        return avg_ratings;
    }

    public void setAvg_ratings(AvgRatingBean avg_ratings) {
        this.avg_ratings = avg_ratings;
    }

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

    public static class AvgRatingBean implements Serializable {
        int one;
        int two;
        int three;
        int four;
        int five;
        float avg;
        int totalReviews;

        public float getAvg() {
            return avg;
        }

        public void setAvg(float avg) {
            this.avg = avg;
        }

        public int getOne() {
            return one;
        }

        public void setOne(int one) {
            this.one = one;
        }

        public int getTwo() {
            return two;
        }

        public void setTwo(int two) {
            this.two = two;
        }

        public int getThree() {
            return three;
        }

        public void setThree(int three) {
            this.three = three;
        }

        public int getFour() {
            return four;
        }

        public void setFour(int four) {
            this.four = four;
        }

        public int getFive() {
            return five;
        }

        public void setFive(int five) {
            this.five = five;
        }

        public int getTotalReviews() {
            return totalReviews;
        }

        public void setTotalReviews(int totalReviews) {
            this.totalReviews = totalReviews;
        }
    }
    public static class ImagesBean implements Serializable {
        String image;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
    public static class InfoBean implements Serializable {
        int id;
        String customer_id;
        String customer_name;
        String customer_email;
        String rating;
        String title;
        String comment;
         String customer_image;
         String created_date;
        ArrayList<ImagesBean> images;

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public ArrayList<ImagesBean> getImages() {
            return images;
        }

        public void setImages(ArrayList<ImagesBean> images) {
            this.images = images;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(String customer_id) {
            this.customer_id = customer_id;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_name(String customer_name) {
            this.customer_name = customer_name;
        }

        public String getCustomer_email() {
            return customer_email;
        }

        public void setCustomer_email(String customer_email) {
            this.customer_email = customer_email;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getCustomer_image() {
            return customer_image;
        }

        public void setCustomer_image(String customer_image) {
            this.customer_image = customer_image;
        }
    }
}
