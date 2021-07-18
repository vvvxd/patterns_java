package com.vvvxd.patterns_java.creational.ptototype;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1,"Egor","1313 233123");
        System.out.println(client);
        ClientFactory factory = new ClientFactory(client);
        Client clientClone = factory.cloneClient();
        System.out.println(clientClone);
    }
}
