package com.vvvxd.patterns_java.structural.bridge;

public abstract class Delivery {
    protected Transport transport;

    public Delivery(Transport transport) {
        this.transport = transport;
    }

    public abstract void delivered();
}
