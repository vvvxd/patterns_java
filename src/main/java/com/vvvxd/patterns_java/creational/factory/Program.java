package com.vvvxd.patterns_java.creational.factory;

public class Program {
    public static void main(String[] args) {
        TransportFactory transportFactory  = createDeveloperByDeliveryMethod("Water");
        Transport transport = transportFactory.createTransport();
        transport.deliver();
    }
    static TransportFactory createDeveloperByDeliveryMethod(String method){
        if (method.equalsIgnoreCase("land")){
            return new CarFactory();
        }else if (method.equalsIgnoreCase("water")){
            return new ShipFactory();
        }else{
             throw new RuntimeException(method+ " is unknown method");
        }
    }
}
