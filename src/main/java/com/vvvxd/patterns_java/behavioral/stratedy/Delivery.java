package com.vvvxd.patterns_java.behavioral.stratedy;

public class Delivery {
    public static void main(String[] args) {
        Package pcg = new Package();
        pcg.setState(new OrderedState());
        pcg.printStatus();
        pcg.setState(new DeliveredState());
        pcg.printStatus();
        pcg.setState(new ReceivedState());
        pcg.printStatus();
    }
}
