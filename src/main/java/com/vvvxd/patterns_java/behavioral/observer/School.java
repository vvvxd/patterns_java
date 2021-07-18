package com.vvvxd.patterns_java.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class School implements Observable {
    private final List<Observer> schoolboys;
    private final List<String> newsChurch;

    School() {
        schoolboys = new ArrayList<>();
        newsChurch = new ArrayList<>();
    }

    public void setNews(String news) {
        this.newsChurch.add(news);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        schoolboys.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        schoolboys.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : schoolboys)
            o.update(this.newsChurch.toString());
    }
}
