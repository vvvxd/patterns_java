package com.vvvxd.patterns_java.behavioral.state;

public class Delivery {
    public static void main(String[] args) {
        PackageState packageState = new OrderedState();
        Package pcg = new Package(packageState);
        do {
            pcg.printStatus();
        }while (pcg.changeState());
    }
}
