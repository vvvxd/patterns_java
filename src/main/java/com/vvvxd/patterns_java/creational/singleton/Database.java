package com.vvvxd.patterns_java.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database database;
    private static List<String> data;

    public static synchronized Database getDatabase(){
        if(database == null){
            database = new Database();
            data = new ArrayList();
        }
        return database;
    }

    private Database(){
    }

    public void addData(String info){
        data.add(info);
    }
    public void showDataBase(){
        System.out.println(data.toString());
    }
}
