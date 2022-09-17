package com.app.swagger_example_springboot.models;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable=false, unique=true)
    private String name;

    @Column(name="population", nullable=false)
    private Long population;

    @Column(name="cities", nullable=false)
    private Long cities;

    @Column(name="status")
    private Boolean status = false;

    public Country(Long id, String name, Long population, Long cities, Boolean status) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.cities = cities;
        this.status = status;
    }

    public Country(String name, Long population, Long cities, Boolean status) {
        this.name = name;
        this.population = population;
        this.cities = cities;
        this.status = status;
    }

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getCities() {
        return cities;
    }

    public void setCities(Long cities) {
        this.cities = cities;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
