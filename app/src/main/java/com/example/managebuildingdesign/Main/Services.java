package com.example.managebuildingdesign.Main;

//كلاس الخدمات المتوفرة في المبنى
public class Services {
    private boolean service_municipal_electricity;// كهرباء بلدية
    private boolean service_private_electricity;// كهرباء خاصة
    private boolean service_municipal_water;// مياه بلدية
    private boolean service_private_water;// مياه خاصة (بير خاص بالمبنى )
    private boolean service_elevator;// خدمة المصاعد
    private boolean service_clean;// خدمة النظافة
    private boolean service_security;// خدمة الامن

    public Services() {
    }

    public Services(boolean service_municipal_electricity, boolean service_private_electricity,
                    boolean service_municipal_water, boolean service_private_water, boolean service_elevator,
                    boolean service_clean, boolean service_security) {
        this.service_municipal_electricity = service_municipal_electricity;
        this.service_private_electricity = service_private_electricity;
        this.service_municipal_water = service_municipal_water;
        this.service_private_water = service_private_water;
        this.service_elevator = service_elevator;
        this.service_clean = service_clean;
        this.service_security = service_security;
    }

    public boolean isService_municipal_electricity() {
        return service_municipal_electricity;
    }

    public void setService_municipal_electricity(boolean service_municipal_electricity) {
        this.service_municipal_electricity = service_municipal_electricity;
    }

    public boolean isService_private_electricity() {
        return service_private_electricity;
    }

    public void setService_private_electricity(boolean service_private_electricity) {
        this.service_private_electricity = service_private_electricity;
    }

    public boolean isService_municipal_water() {
        return service_municipal_water;
    }

    public void setService_municipal_water(boolean service_municipal_water) {
        this.service_municipal_water = service_municipal_water;
    }

    public boolean isService_private_water() {
        return service_private_water;
    }

    public void setService_private_water(boolean service_private_water) {
        this.service_private_water = service_private_water;
    }

    public boolean isService_elevator() {
        return service_elevator;
    }

    public void setService_elevator(boolean service_elevator) {
        this.service_elevator = service_elevator;
    }

    public boolean isService_clean() {
        return service_clean;
    }

    public void setService_clean(boolean service_clean) {
        this.service_clean = service_clean;
    }

    public boolean isService_security() {
        return service_security;
    }

    public void setService_security(boolean service_security) {
        this.service_security = service_security;
    }

}
