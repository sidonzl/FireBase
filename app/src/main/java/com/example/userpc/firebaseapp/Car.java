package com.example.userpc.firebaseapp;

public class Car {
    private String make,model,color;
    private int numwheels;
    private  boolean auromatic;
    private int year;


    public Car(String make, String model, String color, int numwheels, boolean auromatic, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.numwheels = numwheels;
        this.auromatic = auromatic;
        this.year = year;


    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumwheels() {
        return numwheels;
    }

    public void setNumwheels(int numwheels) {
        this.numwheels = numwheels;
    }

    public boolean isAuromatic() {
        return auromatic;
    }

    public void setAuromatic(boolean auromatic) {
        this.auromatic = auromatic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
