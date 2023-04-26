package com.ab.component;

public class SwiftCar implements Car{
    private CarTyers tyers;

    public SwiftCar(CarTyers tyers) {
        System.out.println("Swift car one-param constructor");
        this.tyers = tyers;
    }

    @Override
    public void assemble() {
        System.out.println("Swift car assembled");
    }

    @Override
    public void roadTest() {
        System.out.println("Swift car road-tested");
    }

    @Override
    public String toString() {
        return "SwiftCar" +
                "tyers=" + tyers;
    }
}
