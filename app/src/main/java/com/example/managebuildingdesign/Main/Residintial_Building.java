package com.example.managebuildingdesign.Main;

//مبنى سكني
public class Residintial_Building extends Building {
    private int building_num_of_partments;

    public Residintial_Building() {
    }

    public Residintial_Building(int building_num_of_partments) {
        this.building_num_of_partments = building_num_of_partments;
    }

    public Residintial_Building(String building_name, double building_area, String building_address,
                                int building_num_of_floors, int building_num_of_elevators, int building_num_of_entrances,
                                String building_type, int building_num_of_partments) {
        super(building_name, building_area, building_address, building_num_of_floors, building_num_of_elevators,
                building_num_of_entrances, building_type);
        this.building_num_of_partments = building_num_of_partments;
    }

    public int getBuilding_num_of_partments() {
        return building_num_of_partments;
    }

    public void setBuilding_num_of_partments(int building_num_of_partments) {
        this.building_num_of_partments = building_num_of_partments;
    }

}

