package com.example.managebuildingdesign.Main;


import java.util.ArrayList;

public class Apartments {
    private String apartments_id;
    private double apartments_area;
    private double apartments_address;
    private ArrayList<Services> services;

    public Apartments() {
    }

    public Apartments(String apartments_id, double apartments_area, double apartments_address,
                      ArrayList<Services> services) {
        this.apartments_id = apartments_id;
        this.apartments_area = apartments_area;
        this.apartments_address = apartments_address;
        this.services = services;
    }

    public String getApartments_id() {
        return apartments_id;
    }

    public void setApartments_id(String apartments_id) {
        this.apartments_id = apartments_id;
    }

    public double getApartments_area() {
        return apartments_area;
    }

    public void setApartments_area(double apartments_area) {
        this.apartments_area = apartments_area;
    }

    public double getApartments_address() {
        return apartments_address;
    }

    public void setApartments_address(double apartments_address) {
        this.apartments_address = apartments_address;
    }

    public ArrayList<Services> getServices() {
        return services;
    }

    public void setServices(ArrayList<Services> services) {
        this.services = services;
    }

}
