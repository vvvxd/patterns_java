package com.vvvxd.patterns_java.structural.flyweight;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.HashMap;
import java.util.Map;

public class TransportFactory {
    private static final Map<String,Transport> transports = new HashMap<>();

    public Transport getTransportByMethod(String method){
        Transport transport = transports.get(method);

        if (transport == null){
            switch (method){
                case "water":
                    transport = new Ship();
                    break;
                case "land":
                    transport = new Car();
                    break;
            }
            transports.put(method,transport);
        }
        return transport;
    }
}
