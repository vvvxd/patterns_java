package com.vvvxd.patterns_java.behavioral.observer;

public class Schoolboy implements Observer{
    private String name;

     Schoolboy(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " узнал новость: " + news);
    }
}