package com.vvvxd.patterns_java.behavioral.iterator;

public class Runner {
    public static void main(String[] args) {
        String[] words = {"Hello","word","!!"};
        Text text = new Text("Hy",words);
        Iterator iterator = text.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }
    }
}
