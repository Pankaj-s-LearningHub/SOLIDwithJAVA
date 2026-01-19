package com.learning.solid.nonocp;

public class PaymentService {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CARD")) {
            System.out.println("Processing Card Payment");
        } else if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        } else if (paymentType.equals("NET_BANKING")) {
            System.out.println("Processing Net Banking Payment");
        }
    }
}
