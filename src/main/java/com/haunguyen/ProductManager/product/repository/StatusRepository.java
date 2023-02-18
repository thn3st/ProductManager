package com.haunguyen.ProductManager.product.repository;

import com.haunguyen.ProductManager.product.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
