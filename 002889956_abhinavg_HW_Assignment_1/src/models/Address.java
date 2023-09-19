/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author abhin
 */
public class Address {
 
    private double GPSLocation;
    private String city;
    private String state;
    private String country;

    public double getGPSLocation() {
        return GPSLocation;
    }

    public void setGPSLocation(double GPSLocation) {
        this.GPSLocation = GPSLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
       
    
    
}
