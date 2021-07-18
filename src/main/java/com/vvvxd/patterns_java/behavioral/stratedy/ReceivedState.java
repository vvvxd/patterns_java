package com.vvvxd.patterns_java.behavioral.stratedy;

public class ReceivedState implements PackageState {

    @Override
    public void printStatus() {
        System.out.println("Package received.");
    }
}