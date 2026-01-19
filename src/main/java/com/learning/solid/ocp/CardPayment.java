package com.learning.solid.ocp;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Processing card payment");
    }
}
