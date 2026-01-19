package com.learning.solid.ocp;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.pay();
    }
}
