package com.vvvxd.patterns_java.creational.builder;

public class Home {
    private String walls;
    private String doors;
    private String windows;
    private String roof;
    private int price;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Home{" +
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                ", price=" + price +
                '}';
    }
}