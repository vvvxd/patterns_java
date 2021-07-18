package com.vvvxd.patterns_java.creational.abstractFactory.mcdonalds;

import com.vvvxd.patterns_java.creational.abstractFactory.Burger;
import com.vvvxd.patterns_java.creational.abstractFactory.Drink;
import com.vvvxd.patterns_java.creational.abstractFactory.Garnish;
import com.vvvxd.patterns_java.creational.abstractFactory.SetFactory;

public class MCSetFactory implements SetFactory {
    @Override
    public Burger getBurger() {
        return new BigMac();
    }

    @Override
    public Drink getDrink() {
        return new Pepsi();
    }

    @Override
    public Garnish getGarnish() {
        return new FrenchFries();
    }
}
