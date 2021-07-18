package com.vvvxd.patterns_java.creational.factory;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
