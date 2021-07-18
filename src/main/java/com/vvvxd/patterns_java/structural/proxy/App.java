package com.vvvxd.patterns_java.structural.proxy;

public class App {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
