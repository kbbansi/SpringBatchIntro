package com.kwabena.batchup.repository;

import com.kwabena.batchup.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
