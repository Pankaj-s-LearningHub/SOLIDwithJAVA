package com.learning.solid.ocp;

public class PlaceOrder {
    public void order() {
        PaymentService paymentService = new PaymentService(new UpiPayment());
        paymentService.processPayment();
    }
}
