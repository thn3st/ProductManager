package com.haunguyen.ProductManager.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryDTO {
    private Long id;
    private String subCateCode;
    private String subCateName;
}
