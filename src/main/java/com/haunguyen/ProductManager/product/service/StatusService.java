package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.StatusDTO;

import java.util.List;

public interface StatusService {
    List<StatusDTO> findAll();
}
