package com.example.converttest.dto;

import javax.xml.bind.annotation.XmlElement;

public class Home {

    private String street;
    private String city;
    private String state;
    private String zip;

    @XmlElement(name = "Street", namespace = "http://tempuri.org")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement(name = "City", namespace = "http://tempuri.org")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "State", namespace = "http://tempuri.org")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlElement(name = "Zip", namespace = "http://tempuri.org")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Home{" +
                "street= " + street +
                ", city= " + city +
                ", state= " + state +
                ", zip= " + zip +
                '}';
    }
}
