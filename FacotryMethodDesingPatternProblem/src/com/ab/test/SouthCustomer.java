package com.ab.test;

import com.ab.component.BajajBike;
import com.ab.factory.BajajChenniFactory;
import com.ab.factory.BajajNoidaFactory;

public class SouthCustomer {
    public static void main(String[] args) {
        BajajBike bike = BajajChenniFactory.createBike("discover");
        bike.drive();
    }
}
/*
    Painting Bajaj Bike
    Assembeling bajaj bike
    Oiling bajaj bike
    Road testing bajaj bike
    Driving Bajaj Discover bike
    here customer will get the bike with following all the standrads
*/
