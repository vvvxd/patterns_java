package com.vvvxd.patterns_java.structural.flyweight;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivery by land");
    }
}
