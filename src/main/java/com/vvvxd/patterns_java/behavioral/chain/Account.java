package com.vvvxd.patterns_java.behavioral.chain;

public abstract class Account {
    private  Account nextAccount;
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNextAccount(Account nextAccount) {
        this.nextAccount = nextAccount;
    }

    public void pay(int prise) {
        if (canPay(prise)){
            write();
        }else if (nextAccount != null){
            nextAccount.pay(prise);
        }else{
            System.out.println("There is not enough money on all wallets");
        }
    }
    private boolean canPay(int amount){
        return  balance >= amount;
    }
    public abstract void write();
}
