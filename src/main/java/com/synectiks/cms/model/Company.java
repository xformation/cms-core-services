package com.synectiks.cms.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Product> products;

    public Company(){
    }

    public Company(String name){
        this.name = name;
    }

    public Company(String name, Set<Product> products){
        this.name = name;
        this.products = products;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // products
    public void setProducts(Set<Product> products){
        this.products = products;
    }

    public Set<Product> getProducts(){
        return this.products;
    }
}
