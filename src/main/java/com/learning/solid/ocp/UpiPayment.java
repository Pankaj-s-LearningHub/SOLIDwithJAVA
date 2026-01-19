package com.learning.solid.ocp;

public class UpiPayment implements PaymentMethod {
 @Override
    public void pay() {
        System.out.println("Processing UPI payment");
    }
}
