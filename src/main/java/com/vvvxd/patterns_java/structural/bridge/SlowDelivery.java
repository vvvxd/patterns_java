package com.vvvxd.patterns_java.structural.bridge;

public class SlowDelivery extends Delivery {
    public SlowDelivery(Transport transport) {
        super(transport);
    }

    @Override
    public void delivered() {
        System.out.println("Slow Delivery in process ...");
        transport.deliver();
    }
}
