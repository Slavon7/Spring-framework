package org.example;


import org.springframework.stereotype.Component;

@Component
public class MuscleCar implements Car {
    @Override
    public String getCar(){
        return "Ford";
    }

}
