package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.AddressBean;

public interface OnAddressListener {
    void onAddressAction(int actionType, AddressBean.InfoBean mBeanAddress,int position);
    //actionType: 1=Select, 2=Edit, 3=Delete
}
