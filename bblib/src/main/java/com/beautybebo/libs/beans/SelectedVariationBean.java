package com.beautybebo.libs.beans;

import java.io.Serializable;

public class SelectedVariationBean implements Serializable {
    int groupId;
    ShadesBean.ValuesBean valueBean;

    public SelectedVariationBean(int groupId, ShadesBean.ValuesBean valueBean) {
        this.groupId = groupId;
        this.valueBean = valueBean;
    }

    public SelectedVariationBean() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public ShadesBean.ValuesBean getValueBean() {
        return valueBean;
    }

    public void setValueBean(ShadesBean.ValuesBean valueBean) {
        this.valueBean = valueBean;
    }
}
