package com.example.managebuildingdesign.Main;


public class Building {
    private String building_name;
    private double building_area;
    private String building_address;
    private int building_num_of_floors;
    private int building_num_of_elevators;// عدد المصاعد
    private int building_num_of_entrances;// عدد المداخل

    private String building_type;

    public Building() {
    }

    public Building(String building_name, double building_area, String building_address, int building_num_of_floors,
                    int building_num_of_elevators, int building_num_of_entrances, String building_type) {
        this.building_name = building_name;
        this.building_area = building_area;
        this.building_address = building_address;
        this.building_num_of_floors = building_num_of_floors;
        this.building_num_of_elevators = building_num_of_elevators;
        this.building_num_of_entrances = building_num_of_entrances;
        this.building_type = building_type;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public double getBuilding_area() {
        return building_area;
    }

    public void setBuilding_area(double building_area) {
        this.building_area = building_area;
    }

    public String getBuilding_address() {
        return building_address;
    }

    public void setBuilding_address(String building_address) {
        this.building_address = building_address;
    }

    public int getBuilding_num_of_floors() {
        return building_num_of_floors;
    }

    public void setBuilding_num_of_floors(int building_num_of_floors) {
        this.building_num_of_floors = building_num_of_floors;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public int getBuilding_num_of_elevators() {
        return building_num_of_elevators;
    }

    public void setBuilding_num_of_elevators(int building_num_of_elevators) {
        this.building_num_of_elevators = building_num_of_elevators;
    }

    public int getBuilding_num_of_entrances() {
        return building_num_of_entrances;
    }

    public void setBuilding_num_of_entrances(int building_num_of_entrances) {
        this.building_num_of_entrances = building_num_of_entrances;
    }

}
