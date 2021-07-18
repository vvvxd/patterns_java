package com.vvvxd.patterns_java.behavioral.chain;

public class Paypal extends Account{
    Paypal(int balance) {
        super(balance);
    }

    @Override
    public void write() {
        System.out.println("Paid by Paypal");
    }
}
