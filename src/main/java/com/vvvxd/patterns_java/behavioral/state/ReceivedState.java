package com.vvvxd.patterns_java.behavioral.state;

public class ReceivedState implements PackageState {

    @Override
    public void printStatus() {
        System.out.println("Package received.");
    }
}