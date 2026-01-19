package com.learning.solid.nondip;

public class UpiPaymentService implements PaymentService {
    public void pay(double amount){
        System.out.println("Paying "+amount);
    }
}
