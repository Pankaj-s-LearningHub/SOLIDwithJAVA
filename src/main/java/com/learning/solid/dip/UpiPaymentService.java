package com.learning.solid.dip;

public class UpiPaymentService implements PaymentService {
    public void pay(double amount) {
        System.out.println("Paying "+amount + " using UPI");
    }
}
