package com.learning.solid.nonocp;

public class PlaceOrder {
    private PaymentService paymentService = new PaymentService();

    public void order(String paymentType) {
        paymentService.processPayment(paymentType);
    }
}
