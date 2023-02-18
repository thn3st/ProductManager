package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.SubCategoryDTO;

import java.util.List;

public interface SubCategoryService {
    List<SubCategoryDTO> findAll();
}
