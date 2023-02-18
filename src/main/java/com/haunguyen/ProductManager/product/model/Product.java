package com.haunguyen.ProductManager.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;


@Table(name = "Product")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "origin_price")
    private Double originPrice;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_cate_id", referencedColumnName = "id")
    private SubCategory subCate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status status;

    @ManyToMany(mappedBy = "products")
    private Set<Brand> brands = new LinkedHashSet<>();

    public void addBrand(Brand brand){
        brands.add(brand);
        brand.getProducts().add(this);
    }

    public void removeBrand(Brand brand){
        brands.remove(brand);
        brand.getProducts().remove(this);
    }

    public void clearBrand(){
        this.brands.clear();
    }
}
