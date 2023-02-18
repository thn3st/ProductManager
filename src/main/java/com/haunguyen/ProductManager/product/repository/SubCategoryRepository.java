package com.haunguyen.ProductManager.product.repository;

import com.haunguyen.ProductManager.product.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
