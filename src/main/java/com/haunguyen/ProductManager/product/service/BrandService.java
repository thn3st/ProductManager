package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.BrandDTO;
import com.haunguyen.ProductManager.product.model.Brand;

import java.util.List;

public interface BrandService {
    List<BrandDTO> findAll();
}
