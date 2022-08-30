package com.beautybebo.libs.beans;

import com.beautybebo.libs.beans.CartBean;

import java.io.Serializable;
import java.util.ArrayList;

public class OrderDetailBean implements Serializable {

    Boolean status;
    String message;
    InfoBean info;
    int total_page;

    public int getTotal_page() {
        return total_page;
    }

    public void setTotal_page(int total_page) {
        this.total_page = total_page;
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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class ShippingInfoBean implements Serializable {
        int id;
        String order_id;
        String address_id;
        String first_name;
        String last_name;
        String phone;
        String alternate_phone;
        String address_type;
        String address;
        String country_code;
        String country;
        String state_code;
        String state;
        String city;
        String zip_code;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getAddress_id() {
            return address_id;
        }

        public void setAddress_id(String address_id) {
            this.address_id = address_id;
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

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState_code() {
            return state_code;
        }

        public void setState_code(String state_code) {
            this.state_code = state_code;
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

    public static class OrderProductBean implements Serializable {
        int id;
        int product_id;
        int order_id;
        String url_key;
        String product_image;
        String name;
        String addons_data;
        String attributes;
        String regular_price;
        String sale_price;
        String total;
        int qty;
        int ratings;
        int return_replace;
        Boolean isChecked=true;

        public int getReturn_replace() {
            return return_replace;
        }

        public void setReturn_replace(int return_replace) {
            this.return_replace = return_replace;
        }

        public Boolean getChecked() {
            return isChecked;
        }

        public void setChecked(Boolean checked) {
            isChecked = checked;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public int getOrder_id() {
            return order_id;
        }

        public void setOrder_id(int order_id) {
            this.order_id = order_id;
        }

        public int getRatings() {
            return ratings;
        }

        public void setRatings(int ratings) {
            this.ratings = ratings;
        }

        public String getAttributes() {
            return attributes;
        }

        public void setAttributes(String attributes) {
            this.attributes = attributes;
        }

        public String getUrl_key() {
            return url_key;
        }

        public void setUrl_key(String url_key) {
            this.url_key = url_key;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProduct_image() {
            return product_image;
        }

        public void setProduct_image(String product_image) {
            this.product_image = product_image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddons_data() {
            return addons_data;
        }

        public void setAddons_data(String addons_data) {
            this.addons_data = addons_data;
        }

        public String getRegular_price() {
            return regular_price;
        }

        public void setRegular_price(String regular_price) {
            this.regular_price = regular_price;
        }

        public String getSale_price() {
            return sale_price;
        }

        public void setSale_price(String sale_price) {
            this.sale_price = sale_price;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }
    }

    public static class SubOrderBean implements Serializable {
        int is_returnable;
        int id;
        int vendor_id;
        int order_status_id;
        String first_name;
        String last_name;
        String status;
        ArrayList<OrderProductBean> products;

        public int getIs_returnable() {
            return is_returnable;
        }

        public void setIs_returnable(int is_returnable) {
            this.is_returnable = is_returnable;
        }

        public int getOrder_status_id() {
            return order_status_id;
        }

        public void setOrder_status_id(int order_status_id) {
            this.order_status_id = order_status_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getVendor_id() {
            return vendor_id;
        }

        public void setVendor_id(int vendor_id) {
            this.vendor_id = vendor_id;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public ArrayList<OrderProductBean> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<OrderProductBean> products) {
            this.products = products;
        }
    }

    public static class InfoBean implements Serializable {
        int id;
        String order_prefix;
        String payment_method;
        String payment_code;
        String order_status_id;
        String created_date;
        String modified_date;
        String customer_group;
        String total;
        int total_items;
        ShippingInfoBean shippingAddress;
        ArrayList<CartBean.TotalBean> totals;
        ArrayList<SubOrderBean> sub_order;

        public ArrayList<CartBean.TotalBean> getTotals() {
            return totals;
        }

        public void setTotals(ArrayList<CartBean.TotalBean> totals) {
            this.totals = totals;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public ArrayList<SubOrderBean> getSub_order() {
            return sub_order;
        }

        public void setSub_order(ArrayList<SubOrderBean> sub_order) {
            this.sub_order = sub_order;
        }

        public ShippingInfoBean getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingInfoBean shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOrder_prefix() {
            return order_prefix;
        }

        public void setOrder_prefix(String order_prefix) {
            this.order_prefix = order_prefix;
        }

        public String getPayment_method() {
            return payment_method;
        }

        public void setPayment_method(String payment_method) {
            this.payment_method = payment_method;
        }

        public String getPayment_code() {
            return payment_code;
        }

        public void setPayment_code(String payment_code) {
            this.payment_code = payment_code;
        }

        public String getOrder_status_id() {
            return order_status_id;
        }

        public void setOrder_status_id(String order_status_id) {
            this.order_status_id = order_status_id;
        }

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public String getModified_date() {
            return modified_date;
        }

        public void setModified_date(String modified_date) {
            this.modified_date = modified_date;
        }

        public String getCustomer_group() {
            return customer_group;
        }

        public void setCustomer_group(String customer_group) {
            this.customer_group = customer_group;
        }

        public int getTotal_items() {
            return total_items;
        }

        public void setTotal_items(int total_items) {
            this.total_items = total_items;
        }
    }
}
