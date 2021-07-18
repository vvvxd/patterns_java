package com.vvvxd.patterns_java.creational.abstractFactory.burderking;

import com.vvvxd.patterns_java.creational.abstractFactory.Burger;

public class Vopper implements Burger {
    @Override
    public void cookBurger() {
        System.out.println("cook Vopper");
    }
}
