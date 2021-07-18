package com.vvvxd.patterns_java.creational.builder;

public abstract class HomeBuilder {
    Home home;
    void createHome(){
        home = new Home();
    }
    abstract void buildWalls();
    abstract void buildDoors();
    abstract void buildRoof();
    abstract void buildWindows();
    abstract void buildPrice();

    Home getHome(){
        return home;
    }
}
