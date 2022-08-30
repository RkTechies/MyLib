package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.FilterListBean;

import java.util.ArrayList;

public interface OnApplyFilterListener {
    void onApplyFilter(String strFilterCount,ArrayList<FilterListBean.InfoBean> mListFilters,int actionType);
    void onApplySort(String strSort,String strLabel);
    void onSortDismiss();
}
