package com.example.managebuildingdesign.Main;

//مبنى مشترك (تجاري _ سكني )
public class Mixed_Building extends Building {
    private int building_num_of_partments;
    private int building_number_of_commercial_establishments;

    public Mixed_Building() {
    }

    public Mixed_Building(int building_num_of_partments, int building_number_of_commercial_establishments) {
        this.building_num_of_partments = building_num_of_partments;
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

    public Mixed_Building(String building_name, double building_area, String building_address,
                          int building_num_of_floors, int building_num_of_elevators, int building_num_of_entrances,
                          String building_type, int building_num_of_partments, int building_number_of_commercial_establishments) {
        super(building_name, building_area, building_address, building_num_of_floors, building_num_of_elevators,
                building_num_of_entrances, building_type);
        this.building_num_of_partments = building_num_of_partments;
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

    public int getBuilding_num_of_partments() {
        return building_num_of_partments;
    }

    public void setBuilding_num_of_partments(int building_num_of_partments) {
        this.building_num_of_partments = building_num_of_partments;
    }

    public int getBuilding_number_of_commercial_establishments() {
        return building_number_of_commercial_establishments;
    }

    public void setBuilding_number_of_commercial_establishments(int building_number_of_commercial_establishments) {
        this.building_number_of_commercial_establishments = building_number_of_commercial_establishments;
    }

}
