package org.example;

public class CarController {
    private Car car;
    private String model;
    private int year;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarController(Car car){
        this.car = car;
    }

    public CarController() {}
    public void setCar(Car car) {
        this.car = car;
    }

    public void SelectedCar(){
        System.out.println("Selected: " + car.getCar());
    }
}
