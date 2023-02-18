package com.haunguyen.ProductManager.product.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.haunguyen.ProductManager.product.model.Brand;
import com.haunguyen.ProductManager.product.model.Status;
import com.haunguyen.ProductManager.product.model.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private Long id;

    @NotEmpty(message = "Product name is required")
    private String productName;

    @NotEmpty(message = "Color is required")
    private String color;

    @NotNull(message = "Quantity is required")
    @Min(value = 0, message = "Quantity must min 0")
    private Long quantity;

    @NotNull(message = "Sell price is required")
    @Min(value = 0, message = "Sell price must min 0")
    private Double sellPrice;

    @NotNull(message = "Brands price is required")
    @JsonIgnoreProperties("products")
    private Set<Brand> brands;

    @NotNull(message = "SubCategory price is required")
    @JsonManagedReference
    private SubCategory subCate;

    @NotNull(message = "Origin price is required")
    @Min(value = 0, message = "Origin price must min 0")
    private Double originPrice;

    @NotNull(message = "Status price is required")
    @JsonManagedReference
    private Status status;
}
