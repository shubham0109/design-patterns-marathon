package com.design_patterns;

public class PaymentNotificationObserver implements PaymentObserver{

    @Override
    public void paymentMade() {
        sendNotification();
    }

    public void sendNotification(){
        System.out.println("SEND A PAYMENT NOTIFICATION!!");
    }
}
