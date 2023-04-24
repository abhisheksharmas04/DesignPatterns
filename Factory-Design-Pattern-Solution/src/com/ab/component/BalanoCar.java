package com.ab.component;

public class BalanoCar implements Car{

    private CarTyers tyers;

    public BalanoCar(CarTyers tyers) {
        System.out.println("Balono car one-param constructor");
        this.tyers = tyers;
    }

    @Override
    public void assemble() {
        System.out.println("Balono car is assembled");
    }

    @Override
    public void roadTest() {
        System.out.println("Balono car is road tested");
    }

    @Override
    public String toString() {
        return "BalanoCar with " +
                "tyers=" + tyers;
    }
}
