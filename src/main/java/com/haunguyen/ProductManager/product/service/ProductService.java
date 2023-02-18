package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.ProductDTO;
import com.haunguyen.ProductManager.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDTO> findAll();
    ProductDTO save(ProductDTO productDTO);
    ProductDTO update(Long id, ProductDTO productDTO);
    Optional<ProductDTO> findById(Long id);
}
