package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.FilterListBean;

import java.util.ArrayList;

public interface OnFilterSelectionListener {
    void onParentFilter(ArrayList<FilterListBean.InfoBean> mListParent,int mPositionParent);

    void onChildFilter(ArrayList<FilterListBean.InfoValuesBean> mListChild,int mPositionChild);

    void onPriceFilter(float start, float end);
}
