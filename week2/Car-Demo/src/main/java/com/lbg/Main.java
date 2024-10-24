package com.lbg;
import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

import static com.lbg.classes.CarColour.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        Car bartCar = new Car();
        bartCar.setColour(CarColour.BLACK);
        bartCar.setModel("blah");
        //bartCar.setModel(bartCar.getModel());

        bartCar.accelerate(50);
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar.getColour());
        System.out.println(bartCar.getModel());

        Car lisaCar = new Car("blah2");
        lisaCar.accelerate(80);
        System.out.println(bartCar.getSpeed());

        //Car[] cars = {bartCar, lisaCar};
        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }






    }
}