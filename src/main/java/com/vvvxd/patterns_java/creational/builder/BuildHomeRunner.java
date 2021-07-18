package com.vvvxd.patterns_java.creational.builder;

public class BuildHomeRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new WoodenHouseBuilder());

        Home home = director.buildHome();
        System.out.println(home);
    }
}
