package com.swagger.db_assignment9.controller;

import com.swagger.db_assignment9.model.PaymentMethod;
import com.swagger.db_assignment9.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pay")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/method")
    public String pay(@RequestBody Integer customerId, @RequestBody Integer orderId, @RequestBody PaymentMethod paymentMethod){
        return paymentService.pay(customerId, orderId, paymentMethod);
    }
}
