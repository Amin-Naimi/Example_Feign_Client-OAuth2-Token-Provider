package com.Mohamed.Client.controller;

import com.Mohamed.Client.entity.Payment;
import com.Mohamed.Client.service.PaymentClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class PaymentController {
    private final PaymentClient paymentClient;

    public PaymentController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @GetMapping("/payments")
    public PagedModel<Payment> getPayments() {
        PagedModel<Payment> payments = paymentClient.getAll();
        return payments;
    }
}
