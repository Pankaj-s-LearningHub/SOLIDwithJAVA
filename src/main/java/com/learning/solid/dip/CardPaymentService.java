package com.learning.solid.dip;

public class CardPaymentService implements PaymentService {
    public void pay(double amount) {
        System.out.println("Paying "+amount+ " using Card");
    }
}
