package com.example.tarefasss;

public class DataModal {

    // string variables for our name and job
    private String name;
    private String mensage;

    public DataModal(String name, String job) {
        this.name = name;
        this.mensage = mensage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMesage(String mensage) {
        this.mensage = mensage;
    }

}
