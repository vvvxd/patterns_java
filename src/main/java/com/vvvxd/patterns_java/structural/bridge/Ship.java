package com.vvvxd.patterns_java.structural.bridge;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivery by water");
    }
}
