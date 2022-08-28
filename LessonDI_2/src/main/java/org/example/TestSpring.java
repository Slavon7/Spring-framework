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

        CarController carController = context.getBean("carController", CarController.class );

        carController.SelectedCar();

        System.out.println("Moodel: " + carController.getModel());
        System.out.println("Year: " + carController.getYear());

        context.close();
    }
}
