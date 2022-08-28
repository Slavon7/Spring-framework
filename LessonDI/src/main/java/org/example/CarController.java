package org.example;

public class CarController {
    private Car car;

    public CarController(Car car){
        this.car = car;
    }

    public void SelectedCar(){
        System.out.println("Selected: " + car.getCar());
    }
}
