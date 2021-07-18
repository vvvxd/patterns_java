package com.vvvxd.patterns_java.structural.bridge;

public class DeliveryCreator {
    public static void main(String[] args) {
        Delivery [] deliveries = {
                new FastDelivery(new Ship()),
                new SlowDelivery(new Car())
        };

        for (Delivery delivery: deliveries) {
            delivery.delivered();
        }
    }
}
