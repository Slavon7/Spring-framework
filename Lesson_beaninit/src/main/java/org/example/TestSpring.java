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
        CarController secondCarController = context.getBean("carController", CarController.class );

        boolean commparsion = carController == secondCarController;

        System.out.println(commparsion);

        System.out.println(carController);
        System.out.println(secondCarController);

        carController.setYear(1970);

        System.out.println("Year: " + carController.getYear());
        System.out.println("Year: " + secondCarController.getYear());

    //  carController.SelectedCar();

        System.out.println("Moodel: " + carController.getModel());
    //  System.out.println("Year: " + carController.getYear());

        context.close();
    }
}
