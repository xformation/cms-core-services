package com.synectiks.cms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "leaf_people", joinColumns = @JoinColumn(name = "leaf_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "people_id", referencedColumnName = "id"))
    private List<Leaf> leafs;

    public People() {
    }

    public People(String name) {
        super();
        this.name = name;
    }


    public List<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(List<Leaf> leafs) {
        this.leafs = leafs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
