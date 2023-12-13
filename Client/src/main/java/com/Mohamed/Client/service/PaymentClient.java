package com.Mohamed.Client.service;

import com.Mohamed.Client.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "payment-service", url = "http://localhost:8090/")
public interface PaymentClient {
    @GetMapping("payments")
    PagedModel<Payment> getAll();
}
