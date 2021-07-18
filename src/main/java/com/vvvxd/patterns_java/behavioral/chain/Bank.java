package com.vvvxd.patterns_java.behavioral.chain;

public class Bank extends Account{
    Bank(int balance) {
        super(balance);
    }

    @Override
    public void write() {
        System.out.println("Paid by bank funds");
    }
}
