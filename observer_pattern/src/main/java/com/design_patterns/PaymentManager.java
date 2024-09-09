package com.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentObserver> paymentObserversList;

    public PaymentManager() {
        this.paymentObserversList =new ArrayList<>();
    }

    public void pay(){
        // do the payment
        paymentObserversList.forEach((po) -> po.paymentMade());
    }

    public void registerObserver(PaymentObserver po){
        paymentObserversList.add(po);
    }

    public void unregisterObserver(PaymentObserver po){
        paymentObserversList.remove(po);
    }
}
