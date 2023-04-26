package com.ab.factory;

import com.ab.component.*;

public class CarFactory {
    // static factory method
    public static Car getCar(CarType type){
        Car car = null;
        // create tyers object
        CarTyers tyers = new CarTyers();

        if(type == CarType.BALENO){
            car = new BalanoCar(tyers);
        } else if (type == CarType.SWIFT) {
            car = new SwiftCar(tyers);
        } else if (type == CarType.ERTIGA) {
            car = new ErtigaCar(tyers);
        }else {
            throw  new IllegalArgumentException("Invalid car type");
        }
        car.assemble();
        car.roadTest();

        return car;
    }
}