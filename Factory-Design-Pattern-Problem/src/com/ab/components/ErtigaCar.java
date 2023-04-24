package com.ab.components;

public class ErtigaCar implements Car{
    private CarTyers tyers;

    public ErtigaCar(CarTyers tyers) {
        System.out.println("ErtigaCar car one-param constructor");
        this.tyers = tyers;
    }

    @Override
    public void assemble() {
        System.out.println("Ertiga car assembled");
    }

    @Override
    public void roadTest() {
        System.out.println("Ertiga car road tested");
    }

    @Override
    public String toString() {
        return "ErtigaCar" +
                "tyers=" + tyers;
    }
}