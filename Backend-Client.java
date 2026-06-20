package com.tempus.sac.backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String lastname;
    private String email;
    private String area;

    public Client() {
    }

    public Client(String name, String lastname, String email, String area) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.area = area;
    }

    public Client(Long id, String name, String lastname, String email, String area) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.area = area;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
