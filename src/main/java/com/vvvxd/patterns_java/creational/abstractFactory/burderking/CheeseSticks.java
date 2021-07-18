package com.vvvxd.patterns_java.creational.abstractFactory.burderking;

import com.vvvxd.patterns_java.creational.abstractFactory.Garnish;

public class CheeseSticks implements Garnish {
    @Override
    public void cookGarnish() {
        System.out.println("cook Cheese Sticks");
    }
}
