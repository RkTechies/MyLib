package com.beautybebo.libs.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class ShadesBean implements Serializable {
    Boolean status;
    String message;
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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable {
        int id;
        String type;
        ArrayList<GroupBean> variations;
        ArrayList<ChildProductBean> child_products;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ArrayList<GroupBean> getVariations() {
            return variations;
        }

        public void setVariations(ArrayList<GroupBean> variations) {
            this.variations = variations;
        }

        public ArrayList<ChildProductBean> getChild_products() {
            return child_products;
        }

        public void setChild_products(ArrayList<ChildProductBean> child_products) {
            this.child_products = child_products;
        }
    }

    public static class GroupBean implements Serializable {
        int attribute_id;
        String title;
        String type;
        String code;
        ArrayList<ValuesBean> values;

        public int getAttribute_id() {
            return attribute_id;
        }

        public void setAttribute_id(int attribute_id) {
            this.attribute_id = attribute_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public ArrayList<ValuesBean> getValues() {
            return values;
        }

        public void setValues(ArrayList<ValuesBean> values) {
            this.values = values;
        }
    }

    public static class ValuesBean implements Serializable {
        int attribute_value;
        String url_key;
        String attr_label;
        String attr_value;
        String attr_image;

        public String getAttr_image() {
            return attr_image;
        }

        public void setAttr_image(String attr_image) {
            this.attr_image = attr_image;
        }

        public int getAttribute_value() {
            return attribute_value;
        }

        public void setAttribute_value(int attribute_value) {
            this.attribute_value = attribute_value;
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

  public static class ChildProductBean implements Serializable {
        int id;
        String name;
        String discount;
        String regular_price;
        String sale_price;
        int qty;
        int stock_status;
        String stock_status_name;
        ArrayList<ProductAttrBean> attributes;

      public String getDiscount() {
          return discount;
      }

      public void setDiscount(String discount) {
          this.discount = discount;
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

      public String getStock_status_name() {
          return stock_status_name;
      }

      public void setStock_status_name(String stock_status_name) {
          this.stock_status_name = stock_status_name;
      }

      public ArrayList<ProductAttrBean> getAttributes() {
          return attributes;
      }

      public void setAttributes(ArrayList<ProductAttrBean> attributes) {
          this.attributes = attributes;
      }
  }

    public static class ProductAttrBean implements Serializable {
        int attribute_id;
        String attribute_value;

        public int getAttribute_id() {
            return attribute_id;
        }

        public void setAttribute_id(int attribute_id) {
            this.attribute_id = attribute_id;
        }

        public String getAttribute_value() {
            return attribute_value;
        }

        public void setAttribute_value(String attribute_value) {
            this.attribute_value = attribute_value;
        }
    }
}
