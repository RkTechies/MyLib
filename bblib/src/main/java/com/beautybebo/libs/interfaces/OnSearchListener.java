package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.SearchBean;

public interface OnSearchListener {
    void onCatCliskListener(SearchBean.CatBean mCatBean);
    void onItemCliskListener(SearchBean.InfoBean mProductBean);
}
