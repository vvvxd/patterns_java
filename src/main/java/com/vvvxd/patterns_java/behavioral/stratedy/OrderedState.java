package com.vvvxd.patterns_java.behavioral.stratedy;

public class OrderedState implements PackageState {
    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}