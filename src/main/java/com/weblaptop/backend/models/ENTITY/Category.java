package com.weblaptop.backend.models.ENTITY;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.weblaptop.backend.models.ENTITY.Product.Product;

import javax.persistence.*;
import java.util.List;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProductType", nullable = false)
    private ProductType productType;
//    @OneToMany(mappedBy = "category")
//    private List<Manufacturer> manufacturers;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
    public Category() {
    }

    public Category(long id, String name, ProductType productType,
                    List<Product> products) {
        this.id = id;
        this.name = name;
        this.productType = productType;
//        this.manufacturers = manufacturers;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}