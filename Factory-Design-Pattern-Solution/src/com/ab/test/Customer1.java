package com.ab.test;

import com.ab.component.Car;
import com.ab.factory.CarFactory;

public class Customer1 {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("baleno");
        System.out.println(car1);
    }
}
