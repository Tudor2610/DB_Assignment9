package com.swagger.db_assignment9.repository;

import com.swagger.db_assignment9.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Integer> {
    public CustomerOrder getById(Integer id);
}
