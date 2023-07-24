package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccine")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int contact;
    private String vaccine;
    private String idType;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getVaccine() {
        return vaccine;
    }
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
}
