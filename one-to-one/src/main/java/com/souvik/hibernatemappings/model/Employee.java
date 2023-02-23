package com.souvik.hibernatemappings.model;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
