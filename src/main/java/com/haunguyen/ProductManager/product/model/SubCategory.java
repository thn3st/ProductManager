package com.haunguyen.ProductManager.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "SubCategory")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sub_cate_code")
    private String subCateCode;

    @Column(name = "sub_cate_name")
    private String subCateName;

    @JoinColumn(name = "cate_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Category category;
}
