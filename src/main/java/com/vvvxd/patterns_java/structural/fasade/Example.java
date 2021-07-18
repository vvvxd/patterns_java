package com.vvvxd.patterns_java.structural.fasade;

public class Example {
    public static void main(String... args) {
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        GPSInterface gps = new GPSInterface(power, notifier, advisor);
        gps.activate();
        power.powerOff();
    }
}