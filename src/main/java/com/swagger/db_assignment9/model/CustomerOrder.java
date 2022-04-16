package com.swagger.db_assignment9.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {

    @Id
    @GeneratedValue
    @NotNull
    private Integer id;
    private Double price;

    @ManyToOne
    Customer customer;

    @OneToOne
    Payment payment;
}
