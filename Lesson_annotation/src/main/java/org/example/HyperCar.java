package org.example;


import org.springframework.stereotype.Component;

@Component
public class HyperCar implements Car {
    @Override
    public String getCar(){
        return "McLaren F1";
    }
}
