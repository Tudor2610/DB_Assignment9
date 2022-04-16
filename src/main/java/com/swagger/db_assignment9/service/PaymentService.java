package com.swagger.db_assignment9.service;


import com.swagger.db_assignment9.model.PaymentMethod;
import com.swagger.db_assignment9.repository.CustomerOrderRepository;
import com.swagger.db_assignment9.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final CustomerRepository customerRepository;
    private final CustomerOrderRepository customerOrderRepository;

    public String pay(Integer customerId, Integer orderId, PaymentMethod paymentMethod){
        if(customerOrderRepository.getById(orderId).getPrice() < 1000.0) {
            return "Customer " + customerRepository.getById(customerId) + " paid " + customerOrderRepository.getById(orderId).getPrice() + " with " + paymentMethod.toString();
        } else if (paymentMethod != PaymentMethod.CARD) {
            return  "Invalid payment method!";
        } else {
            return "Customer " + customerRepository.getById(customerId) + " paid " + customerOrderRepository.getById(orderId).getPrice() + " with card";
        }
    }
}
