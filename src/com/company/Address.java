package com.company;

public class Address {
    private String city;
    private String street;
    private int numberHouse;

    public Address(String city, String street, int numberHouse) {
        this.city = city;
        this.street = street;
        this.numberHouse = numberHouse;
    }
    public String getCity(){ return city; }

    public void setCity(String city) {this.city = city;}

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street;}

    public int getNumberHouse() { return numberHouse; }

    public void setNumberHouse(int numberHouse) {this.numberHouse = numberHouse;}

    @Override
    public String toString() {
        return "Address{" +
                "city - " + city +
                ", street - " + street +
                ", numberHouse - " + numberHouse +
                '}';
    }
}
