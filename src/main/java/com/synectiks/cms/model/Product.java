package com.synectiks.cms.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;

    public Product(){
    }

    public Product(String name){
        this.name = name;
    }

    public Product(String name, Company company){
        this.name = name;
        this.company = company;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // products
    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany(){
        return this.company;
    }
}