package com.ab.test;

import com.ab.component.Car;
import com.ab.factory.CarFactory;
import com.ab.factory.CarType;

public class Customer2 {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar(CarType.SWIFT);
        System.out.println(car1);
    }
}
