package com.ab.factory;

import com.ab.component.*;

public class CarFactory {
    // static factory method
    public static Car getCar(String type){
        Car car = null;
        // create tyers object
        CarTyers tyers = new CarTyers();

        if(type.equalsIgnoreCase("baleno")){
            car = new BalanoCar(tyers);
        } else if (type.equalsIgnoreCase("swift")) {
            car = new SwiftCar(tyers);
        } else if (type.equalsIgnoreCase("ertiga")) {
            car = new ErtigaCar(tyers);
        }else {
            throw  new IllegalArgumentException("Invalid car type");
        }
        car.assemble();
        car.roadTest();

        return car;
    }
}