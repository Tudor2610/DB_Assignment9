package com.swagger.db_assignment9.repository;

import com.swagger.db_assignment9.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
    public Payment getById(Integer id);
}
