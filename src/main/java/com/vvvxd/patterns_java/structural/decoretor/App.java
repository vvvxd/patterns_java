package com.vvvxd.patterns_java.structural.decoretor;

public class App {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        System.out.println("Speed of simple car - " + String.valueOf(simpleCar.getSpeed()));
        System.out.println("Simple car can accept baggage with weight " + String.valueOf(simpleCar.getBaggageWeight()));

        Car sportCar = new SportCar(simpleCar);

        System.out.println("Speed of sport car - " + String.valueOf(sportCar.getSpeed()));
        System.out.println("Sport car can accept baggage with weight " + String.valueOf(sportCar.getBaggageWeight()));

        Car truck = new Truck(simpleCar);

        System.out.println("Speed of truck - " + String.valueOf(truck.getSpeed()));
        System.out.println("Truck can accept baggage with weight " + String.valueOf(truck.getBaggageWeight()));
    }
}
