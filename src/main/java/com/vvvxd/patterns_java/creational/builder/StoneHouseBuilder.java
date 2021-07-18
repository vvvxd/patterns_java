package com.vvvxd.patterns_java.creational.builder;

public class StoneHouseBuilder extends HomeBuilder{
    @Override
    void buildWalls() {
        home.setWalls("Stone walls");
    }

    @Override
    void buildDoors() {
        home.setDoors("Stone doors");
    }

    @Override
    void buildRoof() {
        home.setRoof("Stone roof");
    }

    @Override
    void buildWindows() {
        home.setWindows("Stone windows");
    }

    @Override
    void buildPrice() {
        home.setPrice(1000000);
    }
}
