package com.vvvxd.patterns_java.creational.abstractFactory;

import com.vvvxd.patterns_java.creational.abstractFactory.mcdonalds.MCSetFactory;

public class MCSet {
    public static void main(String[] args) {
        SetFactory bkFactory = new MCSetFactory();
        Burger burger = bkFactory.getBurger();
        Drink drink = bkFactory.getDrink();
        Garnish garnish = bkFactory.getGarnish();
        System.out.println("Creating mk set");
        burger.cookBurger();
        drink.pourDrink();
        garnish.cookGarnish();
    }
}
