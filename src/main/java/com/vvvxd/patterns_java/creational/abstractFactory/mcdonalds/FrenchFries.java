package com.vvvxd.patterns_java.creational.abstractFactory.mcdonalds;

import com.vvvxd.patterns_java.creational.abstractFactory.Garnish;

public class FrenchFries implements Garnish {
    @Override
    public void cookGarnish() {
        System.out.println("cook French Fries");
    }
}
