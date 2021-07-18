package com.vvvxd.patterns_java.creational.ptototype;

public class Client implements Copyable{
    private int id;
    private String name;
    private String passport;

    public Client(int id, String name, String passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Client(id,name,passport);
    }
}
