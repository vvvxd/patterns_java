package com.vvvxd.patterns_java.behavioral.chain;

public class Bitcoin extends Account {

    Bitcoin(int balance) {
        super(balance);
    }

    @Override
    public void write() {
        System.out.println("Paid by Paypal");
    }
}
