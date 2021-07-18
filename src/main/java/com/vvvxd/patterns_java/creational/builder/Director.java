package com.vvvxd.patterns_java.creational.builder;

public class Director {
    HomeBuilder builder;
    public void setBuilder(HomeBuilder builder){
        this.builder = builder;
    }
    Home buildHome(){
        builder.createHome();
        builder.buildWalls();
        builder.buildDoors();
        builder.buildPrice();
        builder.buildWindows();
        builder.buildRoof();
        return builder.getHome();
    }
}
