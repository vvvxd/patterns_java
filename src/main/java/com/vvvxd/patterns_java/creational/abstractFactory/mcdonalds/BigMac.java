package com.vvvxd.patterns_java.creational.abstractFactory.mcdonalds;

import com.vvvxd.patterns_java.creational.abstractFactory.Burger;

public class BigMac implements Burger {
    @Override
    public void cookBurger() {
        System.out.println("cook BigMac");
    }
}
