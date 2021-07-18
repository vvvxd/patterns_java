package com.vvvxd.patterns_java.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Schoolboy schoolboy = new Schoolboy("Ivan");
        school.registerObserver(schoolboy);
        school.setNews("The first lesson was canceled");
    }
}
