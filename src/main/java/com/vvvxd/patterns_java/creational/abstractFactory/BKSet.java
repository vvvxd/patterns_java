package com.vvvxd.patterns_java.creational.abstractFactory;

import com.vvvxd.patterns_java.creational.abstractFactory.burderking.BKSetFactory;

public class BKSet {
    public static void main(String[] args) {
        SetFactory bkFactory = new BKSetFactory();
        Burger burger = bkFactory.getBurger();
        Drink drink = bkFactory.getDrink();
        Garnish garnish = bkFactory.getGarnish();
        System.out.println("Creating bk set");
        burger.cookBurger();
        drink.pourDrink();
        garnish.cookGarnish();
    }
}
