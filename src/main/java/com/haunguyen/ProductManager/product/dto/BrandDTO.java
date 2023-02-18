package com.haunguyen.ProductManager.product.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.haunguyen.ProductManager.product.model.Product;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandDTO {
    private Long id;
    private String brandName;
}
