package com.synectiks.cms.model;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
public class Library {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    @RestResource(path = "libraryAddress", rel="address")
    private Address address;

    // standard constructor, getters, setters
}