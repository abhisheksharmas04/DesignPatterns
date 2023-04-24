package com.ab.test;

import com.ab.components.Car;
import com.ab.components.CarTyers;
import com.ab.components.SwiftCar;

public class CustomerTwo {
    public static void main(String[] args) {
        /*in this example to make the car object we should create the cartyers object*/
        CarTyers tyers = new CarTyers();

        Car car = new SwiftCar(tyers);
        car.assemble();
        car.roadTest();
        System.out.println(car);
    }
}
