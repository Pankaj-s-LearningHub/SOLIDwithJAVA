package com.learning.solid.srp;

public class PlaceOrder {
    private CustomerService customerService = new CustomerService();
    private PaymentService paymentService = new PaymentService();
    private OrderService orderService = new OrderService();
    private ProductService productService = new ProductService();
    private EmailService emailService = new EmailService();
    private InvoiceService invoiceService = new InvoiceService();

    public void order() {
        customerService.getCustomerDetails();
        productService.getProductDetails();
        paymentService.processPayment();
        orderService.placeOrder();
        emailService.SendEmail();
        invoiceService.generateInvoice();
    }
}
