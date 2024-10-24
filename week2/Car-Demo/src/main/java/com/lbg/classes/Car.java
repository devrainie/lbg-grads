package com.lbg.classes;

public class Car {

    public Car(String model){
        this.setModel(model); // have to use the word 'this' as there cannot distinguish model vars

    }
    public Car(){
        this.make = "Unknown";
        this.setModel("Unknown"); // more foolproof as method contains validation
    }
    private int speed;
    private String make;
    private CarColour colour;
    private String model;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public CarColour getColour() {
        return colour;
    }
    public void setColour(CarColour colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void accelerate(int deltaV){
        if(deltaV > 0)
            this.speed += deltaV;
    }

    public void deccelerate(int deltaV){
        this.speed -= deltaV;
    }



}
