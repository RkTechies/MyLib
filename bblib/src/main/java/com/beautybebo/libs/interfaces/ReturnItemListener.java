package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.OrderDetailBean;

import java.util.ArrayList;

public interface ReturnItemListener {
    void onItemSelect(ArrayList<OrderDetailBean.OrderProductBean> list);
}
