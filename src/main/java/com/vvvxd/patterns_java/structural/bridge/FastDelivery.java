package com.vvvxd.patterns_java.structural.bridge;

public class FastDelivery extends Delivery{
    public FastDelivery(Transport transport) {
        super(transport);
    }

    @Override
    public void delivered() {
        System.out.println("Fast Delivery in process ...");
        transport.deliver();
    }
}
