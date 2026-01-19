package com.learning.solid.nondip;

public class PlaceOrder {
    PaymentService paymentService = new UpiPaymentService();
     public void placeOrder(){
         paymentService.pay(1000);
     }
}
