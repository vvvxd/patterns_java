package com.vvvxd.patterns_java.creational.factory;

public class CarFactory implements TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
