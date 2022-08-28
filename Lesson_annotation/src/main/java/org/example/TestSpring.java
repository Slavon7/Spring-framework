package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vyacehslav Omenyuk
 */


public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Car car = context.getBean("hyperCar", Car.class );

        CarController carController = new CarController(car);

        carController.SelectedCar();

        context.close();
    }
}
