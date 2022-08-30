package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.CartBean;

public interface OnCartActionClickListener {
    void onCartAction(int actionType, int position, CartBean.InfoBean mBeanCart);
}
