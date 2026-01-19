package com.learning.solid.nonsrp;

public class PlaceOrder {

    public void order() {
        // Fetch customer details from DB or any other source
        System.out.println("Get Customer Details");

        //Fetch product details logic
        System.out.println("Get Product Details");

        //Payment processing logic
        System.out.println("Payment Processing");

        // Place order logic
        System.out.println("Place Order");

        // Send email logic
        System.out.println("Send Order Confirmation Email");

        // Generate invoice logic
        System.out.println("Generate Invoice");
    }
}
