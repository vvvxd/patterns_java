package com.vvvxd.patterns_java.creational.abstractFactory.mcdonalds;

import com.vvvxd.patterns_java.creational.abstractFactory.Drink;

public class Pepsi implements Drink {
    @Override
    public void pourDrink() {
        System.out.println("pour Pepsi");
    }
}
