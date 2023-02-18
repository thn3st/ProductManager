package com.haunguyen.ProductManager.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Brand")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "brand_name")
    private String brandName;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "product_brand", joinColumns = @JoinColumn(name = "brand_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products = new LinkedHashSet<>();
}
