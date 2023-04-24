package com.ab.test;

import com.ab.components.BalanoCar;
import com.ab.components.Car;
import com.ab.components.CarTyers;

public class CustomerOne {
    public static void main(String[] args) {
        /*in this example to make the car object we should create the cartyers object*/
        CarTyers tyers = new CarTyers();

        Car car = new BalanoCar(tyers);
        car.assemble();
        car.roadTest();
        System.out.println(car);
    }
}
