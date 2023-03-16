package org.example;

import java.io.Serializable;

public class Adress implements Serializable {
    String city;
    String town;
    String phoneNumber;

    public Adress(String city, String town, String phoneNumber) {
        this.city = city;
        this.town = town;
        this.phoneNumber = phoneNumber;
    }

    public Adress() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Adress:" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                '}';
    }
}
