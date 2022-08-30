package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductInfoBean implements Serializable {
    Boolean status;
    String message;
    int total_page;
    InfoBean info;

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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
        int id;
        Boolean isWishlist=false;
        String vendor_name;
        String brand_name;
        String brand_slug;
        int brand_id;
        String weight;
        String weight_class_id;
        String sku;
        String url_key;
        String parent_id;
        String cod_available;
        String type;
        String regular_price;
        String sale_price;
        String name;
        String sort_description;
        String description;
        String discount;
        int qty;
        int stock_status;
        int min_qty;
        int max_qty;
        int allow_pre_order;
        int allow_gift_message;
        String productRatings;
        int totalRatings;
        ArrayList<CommonBean> specifications;
        ArrayList<CommonBean> otherInfo;
        ArrayList<Images> images;
        ArrayList<ShadesBean.GroupBean> variations;
        ArrayList<ShadesBean.ChildProductBean> child_products;

        public Boolean getWishlist() {
            return isWishlist;
        }

        public void setWishlist(Boolean wishlist) {
            isWishlist = wishlist;
        }

        public ArrayList<CommonBean> getSpecifications() {
            return specifications;
        }

        public void setSpecifications(ArrayList<CommonBean> specifications) {
            this.specifications = specifications;
        }

        public ArrayList<CommonBean> getOtherInfo() {
            return otherInfo;
        }

        public void setOtherInfo(ArrayList<CommonBean> otherInfo) {
            this.otherInfo = otherInfo;
        }

        public String getVendor_name() {
            return vendor_name;
        }

        public void setVendor_name(String vendor_name) {
            this.vendor_name = vendor_name;
        }

        public String getProductRatings() {
            return productRatings;
        }

        public void setProductRatings(String productRatings) {
            this.productRatings = productRatings;
        }

        public int getTotalRatings() {
            return totalRatings;
        }

        public void setTotalRatings(int totalRatings) {
            this.totalRatings = totalRatings;
        }

        public ArrayList<ShadesBean.GroupBean> getVariations() {
            return variations;
        }

        public void setVariations(ArrayList<ShadesBean.GroupBean> variations) {
            this.variations = variations;
        }

        public ArrayList<ShadesBean.ChildProductBean> getChild_products() {
            return child_products;
        }

        public void setChild_products(ArrayList<ShadesBean.ChildProductBean> child_products) {
            this.child_products = child_products;
        }

        public ArrayList<Images> getImages() {
            return images;
        }

        public void setImages(ArrayList<Images> images) {
            this.images = images;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBrand_name() {
            return brand_name;
        }

        public void setBrand_name(String brand_name) {
            this.brand_name = brand_name;
        }

        public String getBrand_slug() {
            return brand_slug;
        }

        public void setBrand_slug(String brand_slug) {
            this.brand_slug = brand_slug;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getWeight_class_id() {
            return weight_class_id;
        }

        public void setWeight_class_id(String weight_class_id) {
            this.weight_class_id = weight_class_id;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getUrl_key() {
            return url_key;
        }

        public void setUrl_key(String url_key) {
            this.url_key = url_key;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getCod_available() {
            return cod_available;
        }

        public void setCod_available(String cod_available) {
            this.cod_available = cod_available;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSort_description() {
            return sort_description;
        }

        public void setSort_description(String sort_description) {
            this.sort_description = sort_description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public int getStock_status() {
            return stock_status;
        }

        public void setStock_status(int stock_status) {
            this.stock_status = stock_status;
        }

        public int getMin_qty() {
            return min_qty;
        }

        public void setMin_qty(int min_qty) {
            this.min_qty = min_qty;
        }

        public int getMax_qty() {
            return max_qty;
        }

        public void setMax_qty(int max_qty) {
            this.max_qty = max_qty;
        }

        public int getAllow_pre_order() {
            return allow_pre_order;
        }

        public void setAllow_pre_order(int allow_pre_order) {
            this.allow_pre_order = allow_pre_order;
        }

        public int getAllow_gift_message() {
            return allow_gift_message;
        }

        public void setAllow_gift_message(int allow_gift_message) {
            this.allow_gift_message = allow_gift_message;
        }
    }

    public static class Images implements Serializable {
        int id;
        int product_id;
        String image;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
