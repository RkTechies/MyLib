package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.ProductListBean;

public interface OnProductListener {
    void onCartActionClick(ProductListBean.InfoBean mProductBean);
    void onWishlistClick(ProductListBean.InfoBean mProductBean, int mPosition);
    void onInfoCLick(ProductListBean.InfoBean mProductBean, int mPosition);
}
