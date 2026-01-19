package com.learning.solid.dip;
import com.learning.solid.dip.UpiPaymentService;
import com.learning.solid.dip.PaymentService;

public class PlaceOrder {
    private final PaymentService paymentService;
    public PlaceOrder(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("Order Placed");
        this.paymentService.pay(amount);
    }

    public static void main(String[] args) {
        PaymentService paymentService1 = new UpiPaymentService();
        PaymentService paymentService2 = new CardPaymentService();

        PlaceOrder placeOrder = new PlaceOrder(paymentService2);
        placeOrder.placeOrder(500);


    }
}
