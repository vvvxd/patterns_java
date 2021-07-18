package com.vvvxd.patterns_java.behavioral.memento;

class Program
{
    public static void main(String[] args) {
        TextEditor.Run();
    }
}

class TextEditor
{
    public static void Run()
    {
        Doc myDocument = new Doc();

        EditorHistory history = new EditorHistory();

        myDocument.AddBlock("Привет, мир!");
        myDocument.SetStyle(2);
        myDocument.Print();

        history.Push(myDocument.SaveState());

        myDocument.AddBlock("И снова привет!!!");
        myDocument.SetStyle(3);
        myDocument.Print();

        myDocument.RestoreState(history.Pop());
        myDocument.Print();

    }
}