package com.arun.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS_TBL")
public class Address implements Serializable {

    private long addressId;
    private String street;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID")
    public long getAddressId() {
        return this.addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    @Column(name = "ADDRESS_STREET", nullable = false, length=250)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "ADDRESS_CITY", nullable = false, length=50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "ADDRESS_STATE", nullable = false, length=50)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}