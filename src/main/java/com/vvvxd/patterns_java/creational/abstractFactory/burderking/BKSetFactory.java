package com.vvvxd.patterns_java.creational.abstractFactory.burderking;

import com.vvvxd.patterns_java.creational.abstractFactory.Burger;
import com.vvvxd.patterns_java.creational.abstractFactory.Drink;
import com.vvvxd.patterns_java.creational.abstractFactory.Garnish;
import com.vvvxd.patterns_java.creational.abstractFactory.SetFactory;

public class BKSetFactory implements SetFactory {
    @Override
    public Burger getBurger() {
        return new Vopper();
    }

    @Override
    public Drink getDrink() {

        return new CocoCola();
    }

    @Override
    public Garnish getGarnish() {

        return new CheeseSticks();
    }
}
