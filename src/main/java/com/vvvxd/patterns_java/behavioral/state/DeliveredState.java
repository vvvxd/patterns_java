package com.vvvxd.patterns_java.behavioral.state;

public class DeliveredState implements PackageState {

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}