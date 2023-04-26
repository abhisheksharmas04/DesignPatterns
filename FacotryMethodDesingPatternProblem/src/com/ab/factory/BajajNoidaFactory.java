package com.ab.factory;

import com.ab.component.BajajBike;
import com.ab.component.BajajDiscover;
import com.ab.component.BajajPlatina;
import com.ab.component.BajajPulsor;

public class BajajNoidaFactory {

    public static void pain(){
        System.out.println("Painting Bajaj Bike");
    }
    public static void assemble(){
        System.out.println("Assembeling bajaj bike");
    }

    public static void roadTest(){
        System.out.println("Road testing bajaj bike");
    }

    public static void oiling(){
        System.out.println("Oiling bajaj bike");
    }

    // factory method design pattern
    public static BajajBike createBike(String type){
        BajajBike bike = null;
        if(type.equalsIgnoreCase("Discover")){
            bike = new BajajDiscover();
        } else if (type.equalsIgnoreCase("Platina")) {
            bike = new BajajPlatina();
        } else if (type.equalsIgnoreCase("Pulsor")) {
            bike = new BajajPulsor();
        }else{
            throw new IllegalArgumentException("Invalid bike type");
        }
        assemble();
        oiling();
        pain();
        // They are completing forget road test and they are returning Bike object
        return bike;
    }
}