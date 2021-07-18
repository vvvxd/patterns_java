package com.vvvxd.patterns_java.behavioral.memento;

public class Doc {
    private String text = "";
    private int style = 1;

    public void AddBlock(String text) {
        this.text += text + '\n';
        System.out.println("Добавлен блок:" + text);
    }

    public DocMemento SaveState() {
        System.out.println("Сохранение документа.");
        return new DocMemento(text, style);
    }

    public void RestoreState(DocMemento memento) {
        text = memento.Text;
        style = memento.Style;
    }

    public void SetStyle(int style) {
        if (this.style != style) {
            this.style = style;
        }
        System.out.println("Установлен стиль: тип " + style);
    }

    public void Print() {
        System.out.println("\n--- ПЕЧАТЬ ---\nСтиль: тип " + style + "\nТекст:\n" + text);
    }
}
