package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class CheckoutBeans implements Serializable {
    Boolean status;
    String message;
    String shipping_error;
    String coupon_success;
    String coupon_error;
    String reward_error;
    ArrayList<CartBean.InfoBean> info;
    ArrayList<CartBean.TotalBean> totals;
    ArrayList<PaymentsBean> payment_methods;
    RewardsBean reward;

    public ArrayList<CartBean.InfoBean> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<CartBean.InfoBean> info) {
        this.info = info;
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

    public String getShipping_error() {
        return shipping_error;
    }

    public void setShipping_error(String shipping_error) {
        this.shipping_error = shipping_error;
    }

    public String getCoupon_success() {
        return coupon_success;
    }

    public void setCoupon_success(String coupon_success) {
        this.coupon_success = coupon_success;
    }

    public String getCoupon_error() {
        return coupon_error;
    }

    public void setCoupon_error(String coupon_error) {
        this.coupon_error = coupon_error;
    }

    public String getReward_error() {
        return reward_error;
    }

    public void setReward_error(String reward_error) {
        this.reward_error = reward_error;
    }

    public ArrayList<CartBean.TotalBean> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<CartBean.TotalBean> totals) {
        this.totals = totals;
    }

    public ArrayList<PaymentsBean> getPayment_methods() {
        return payment_methods;
    }

    public void setPayment_methods(ArrayList<PaymentsBean> payment_methods) {
        this.payment_methods = payment_methods;
    }

    public RewardsBean getReward() {
        return reward;
    }

    public void setReward(RewardsBean reward) {
        this.reward = reward;
    }

    public static class RewardsBean {
        int is_reward_active;
        int max_usable_reward;
        int customer_reward;
        float reward_exchange_rate;

        public int getIs_reward_active() {
            return is_reward_active;
        }

        public void setIs_reward_active(int is_reward_active) {
            this.is_reward_active = is_reward_active;
        }

        public int getMax_usable_reward() {
            return max_usable_reward;
        }

        public void setMax_usable_reward(int max_usable_reward) {
            this.max_usable_reward = max_usable_reward;
        }

        public int getCustomer_reward() {
            return customer_reward;
        }

        public void setCustomer_reward(int customer_reward) {
            this.customer_reward = customer_reward;
        }

        public float getReward_exchange_rate() {
            return reward_exchange_rate;
        }

        public void setReward_exchange_rate(float reward_exchange_rate) {
            this.reward_exchange_rate = reward_exchange_rate;
        }
    }

    public static class PaymentsBean {
        Boolean isSelected=false;
        String title;
        String code;
        String description;
        String min_cart_value;
        String max_cart_value;

        public Boolean getSelected() {
            return isSelected;
        }

        public void setSelected(Boolean selected) {
            isSelected = selected;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMin_cart_value() {
            return min_cart_value;
        }

        public void setMin_cart_value(String min_cart_value) {
            this.min_cart_value = min_cart_value;
        }

        public String getMax_cart_value() {
            return max_cart_value;
        }

        public void setMax_cart_value(String max_cart_value) {
            this.max_cart_value = max_cart_value;
        }
    }
}
