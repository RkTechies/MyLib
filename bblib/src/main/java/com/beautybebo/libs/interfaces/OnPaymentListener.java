package com.beautybebo.libs.interfaces;

import com.beautybebo.libs.beans.CheckoutBeans;

public interface OnPaymentListener {
    void onPaymentSelect(CheckoutBeans.PaymentsBean mBeanPayment);
}
