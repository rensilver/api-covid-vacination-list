package com.rensilver.crud.apicovidvacinationlist.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_citizen")
public class Citizen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany
    @JoinTable(name = "tb_citizen_category",
        joinColumns = @JoinColumn(name = "citizen_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories = new HashSet<>();

    public Citizen() {
    }

    public Citizen(Citizen entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.categories = entity.getCategories();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Category> getCategories() {
        return categories;
    }
}