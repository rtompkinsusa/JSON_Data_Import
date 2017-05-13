/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.json_data_import;

/**
 *
 * @author Russell
 */
public class Customer {

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", city=" + city + ", country=" + country + '}';
    }
    
    private String name;
    private String city;
    private String country;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    


    
    
    
    
    
}
