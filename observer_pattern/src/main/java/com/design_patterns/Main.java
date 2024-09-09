package com.design_patterns;

public class Main {
    public static void main(String[] args) {

        PaymentManager paymentManager = new PaymentManager();

        PaymentObserver notificationObserver = new PaymentNotificationObserver();
        PaymentObserver loggerObserver = new PaymentLoggerObserver("id1");

        paymentManager.registerObserver(notificationObserver);
        paymentManager.registerObserver(loggerObserver);

        paymentManager.pay();

        paymentManager.unregisterObserver(loggerObserver);

        paymentManager.pay();


    }
}