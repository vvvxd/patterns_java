package com.vvvxd.patterns_java.behavioral.memento;

public class DocMemento {
    public String Text ;
    public int Style ;

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getStyle() {
        return Style;
    }

    public void setStyle(int style) {
        Style = style;
    }

    public DocMemento(String text, int style)
    {
        Text = text;
        Style = style;
    }
}
