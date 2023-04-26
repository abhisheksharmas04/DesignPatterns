package com.ab.test;

import com.ab.component.BajajBike;
import com.ab.factory.BajajNoidaFactory;

public class NorthCustomer {
    public static void main(String[] args) {
        BajajBike bike = BajajNoidaFactory.createBike("discover");
        bike.drive();
    }
}

        /*Assembeling bajaj bike
        Oiling bajaj bike
        Painting Bajaj Bike
        Driving Bajaj Discover bike
        Here customer will get the bike but factory not following any standrad. They are completely forgettng to read test of the bike.*/
