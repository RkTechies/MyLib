package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.OrderBean;

public interface OnOrderListener {
    void onOrderClick(int mPosition, OrderBean.InfoBean mBeanOrder);
}
