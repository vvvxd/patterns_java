package com.vvvxd.patterns_java.behavioral.chain;

public class App {
    public static void main(String[] args) {
        Account bank = new Bank(300);
        Account paypal = new Paypal(600);
        Account bitcoin = new Bitcoin(500);
        bank.setNextAccount(paypal);
        paypal.setNextAccount(bitcoin);
        bank.pay(500);
    }
}
