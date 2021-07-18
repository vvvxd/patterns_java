package com.vvvxd.patterns_java.behavioral.command;


import java.util.ArrayList;
import java.util.List;

class RemoteControl{
    private List<Command> buttons;

    public RemoteControl(){
        buttons = new ArrayList();
    }

    public void setCommand(int numButton, Command command){
        buttons.add(numButton, command);
    }

    public void buttonPress(int numButton){
        buttons.get(numButton).execute();
    }
}