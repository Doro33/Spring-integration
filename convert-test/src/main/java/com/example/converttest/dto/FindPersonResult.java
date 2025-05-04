package com.example.converttest.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FindPersonResult", namespace = "http://tempuri.org")
public class FindPersonResult {

    private String name;
    private String ssn;
    private String dob;
    private Home home;
    private Office office;
    private FavoriteColors favoriteColors;
    private int age;

    @XmlElement(name = "Name", namespace = "http://tempuri.org")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "SSN", namespace = "http://tempuri.org")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @XmlElement(name = "DOB", namespace = "http://tempuri.org")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @XmlElement(name = "Home", namespace = "http://tempuri.org")
    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @XmlElement(name = "Office", namespace = "http://tempuri.org")
    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @XmlElement(name = "FavoriteColors", namespace = "http://tempuri.org")
    public FavoriteColors getFavoriteColors() {
        return favoriteColors;
    }

    public void setFavoriteColors(FavoriteColors favoriteColors) {
        this.favoriteColors = favoriteColors;
    }

    @XmlElement(name = "Age", namespace = "http://tempuri.org")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FindPersonResult{" +
                "name= " + name +
                ", ssn= " + ssn +
                ", dob= " + dob +
                ", home= " + home +
                ", office= " + office +
                ", favoriteColors= " + favoriteColors +
                ", age= " + age +
                '}';
    }
}