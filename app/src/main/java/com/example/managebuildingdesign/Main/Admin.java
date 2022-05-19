package com.example.managebuildingdesign.Main;


public class Admin {

    private String admin_first_name;
    private String admin_last_name;
    private String admin_id_num;
    private String admin_email;
    private String admin_phone;
    private String admin_password;

    public Admin() {
    }

    public Admin(String admin_first_name, String admin_last_name, String admin_id_num, String admin_email,
                 String admin_phone, String admin_password) {
        this.admin_first_name = admin_first_name;
        this.admin_last_name = admin_last_name;
        this.admin_id_num = admin_id_num;
        this.admin_email = admin_email;
        this.admin_phone = admin_phone;
        this.admin_password = admin_password;
    }

    public String getAdmin_first_name() {
        return admin_first_name;
    }

    public void setAdmin_first_name(String admin_first_name) {
        this.admin_first_name = admin_first_name;
    }

    public String getAdmin_last_name() {
        return admin_last_name;
    }

    public void setAdmin_last_name(String admin_last_name) {
        this.admin_last_name = admin_last_name;
    }

    public String getAdmin_id_num() {
        return admin_id_num;
    }

    public void setAdmin_id_num(String admin_id_num) {
        this.admin_id_num = admin_id_num;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

}