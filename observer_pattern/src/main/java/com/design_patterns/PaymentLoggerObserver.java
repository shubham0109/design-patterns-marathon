package com.design_patterns;

import java.util.Objects;

public class PaymentLoggerObserver implements PaymentObserver{

    private String id;

    public PaymentLoggerObserver(String id) {
        this.id = id;
    }

    @Override
    public void paymentMade() {
        logEvent();
    }

    public void logEvent(){
        System.out.println("LOG PAYMENT EVENT!!!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentLoggerObserver that = (PaymentLoggerObserver) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
