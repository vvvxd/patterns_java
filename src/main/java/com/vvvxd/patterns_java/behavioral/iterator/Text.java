package com.vvvxd.patterns_java.behavioral.iterator;

public class Text implements Collection{
    private String name;
    private String[] words;

    public Text(String name, String[] words) {
        this.name = name;
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    @Override
    public Iterator getIterator() {
        return new WordIterator();
    }

    private class WordIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index<words.length){
                return true;
            }
            return false;

        }

        @Override
        public Object next() {
            return words[index++];
        }
    }
}

