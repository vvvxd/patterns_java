package com.vvvxd.patterns_java.creational.singleton;

public class Program {
    public static void main(String[] args) {
        Database.getDatabase().addData("iNFO");
        Database.getDatabase().showDataBase();
    }
}
