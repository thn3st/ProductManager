package com.haunguyen.ProductManager.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusDTO {
    private Long id;
    private String statusName;
}
