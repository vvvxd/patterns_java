package com.vvvxd.patterns_java.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        List<Transport> transports = new ArrayList<>();

        transports.add(transportFactory.getTransportByMethod("land"));
        transports.add(transportFactory.getTransportByMethod("land"));
        transports.add(transportFactory.getTransportByMethod("land"));
        transports.add(transportFactory.getTransportByMethod("land"));
        transports.add(transportFactory.getTransportByMethod("land"));
        transports.add(transportFactory.getTransportByMethod("water"));
        transports.add(transportFactory.getTransportByMethod("water"));
        transports.add(transportFactory.getTransportByMethod("water"));
        transports.add(transportFactory.getTransportByMethod("water"));
        transports.add(transportFactory.getTransportByMethod("water"));

        for (Transport tr: transports) {
            tr.deliver();
        }

    }
}
