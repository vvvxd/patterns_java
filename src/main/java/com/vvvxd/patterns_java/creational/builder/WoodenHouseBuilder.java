package com.vvvxd.patterns_java.creational.builder;

public class WoodenHouseBuilder extends HomeBuilder {
    @Override
    void buildWalls() {
        home.setWalls("Wooden walls");
    }

    @Override
    void buildDoors() {
        home.setDoors("Wooden doors");
    }

    @Override
    void buildRoof() {
        home.setRoof("Wooden roof");
    }

    @Override
    void buildWindows() {
        home.setWindows("Wooden windows");
    }

    @Override
    void buildPrice() {
        home.setPrice(1000000);
    }
}
