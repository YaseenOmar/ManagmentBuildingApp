package com.example.managebuildingdesign.Main;


//  مبنى تجاري
public class Commercial_Building extends Building {
    private int building_number_of_commercial_establishments;// عدد المنشأت التجارية

    public Commercial_Building() {
    }

    public Commercial_Building(int building_number_of_commercial_establishments) {
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

    public Commercial_Building(String building_name, double building_area, String building_address,
                               int building_num_of_floors, int building_num_of_elevators, int building_num_of_entrances,
                               String building_type, int building_number_of_commercial_establishments) {
        super(building_name, building_area, building_address, building_num_of_floors, building_num_of_elevators,
                building_num_of_entrances, building_type);
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

    public int getBuilding_number_of_commercial_establishments() {
        return building_number_of_commercial_establishments;
    }

    public void setBuilding_number_of_commercial_establishments(int building_number_of_commercial_establishments) {
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

}

