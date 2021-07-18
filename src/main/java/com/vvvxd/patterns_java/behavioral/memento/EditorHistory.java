package com.vvvxd.patterns_java.behavioral.memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EditorHistory {
    private LinkedList<DocMemento> History;

    public List<DocMemento> getHistory() {
        return History;
    }

    public void setHistory(List<DocMemento> history) {
        History = (LinkedList<DocMemento>) history;
    }

    public EditorHistory()
    {
        History = new LinkedList<>();
    }

    public void Push(DocMemento memento)
    {
        System.out.println("Сохранение документа.");
        History.add(memento);
    }

    public DocMemento Pop()
    {
        System.out.println("Отмена последних действий.");
        return History.pollLast();
    }
}
