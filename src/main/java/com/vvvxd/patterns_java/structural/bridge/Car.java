package com.vvvxd.patterns_java.structural.bridge;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivery by land");
    }
}
