package com.vvvxd.patterns_java.creational.abstractFactory.burderking;

import com.vvvxd.patterns_java.creational.abstractFactory.Drink;

public class CocoCola implements Drink {
    @Override
    public void pourDrink() {
        System.out.println("pour Coco Cola");
    }
}
