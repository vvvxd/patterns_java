package com.vvvxd.patterns_java.structural.decoretor;

public class Truck implements Car {
    private Car car;
    public Truck(Car car){
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed();
    }

    @Override
    public int getBaggageWeight() {
        return this.car.getBaggageWeight() + 1000;
    }
}
