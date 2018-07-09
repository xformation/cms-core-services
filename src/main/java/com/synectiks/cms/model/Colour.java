package com.synectiks.cms.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Colour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "colour_id")
    @RestResource(path = "colourflower")
    private Flower flower;

    @OneToMany(mappedBy = "colour")
    private List<Leaf> leafs;


    public Colour() {
    }

    public Colour(String name) {
        super();
        this.name = name;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(List<Leaf> leafs) {
        this.leafs = leafs;
    }
}