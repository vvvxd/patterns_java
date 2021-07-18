package com.vvvxd.patterns_java.creational.ptototype;

public class ClientFactory {
    Client client;

    public ClientFactory(Client client) {
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    Client cloneClient(){
        return (Client) client.copy();
    }
}
