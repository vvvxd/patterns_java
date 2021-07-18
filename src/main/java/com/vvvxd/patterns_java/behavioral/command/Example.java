package com.vvvxd.patterns_java.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Example{
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();
        Engine engine = new Engine();
        StartEngine startEngine = new StartEngine(engine);
        Condition condition = new Condition();
        StartCondition startCondition = new StartCondition(condition);

        List commands = new ArrayList();
        commands.add(startEngine);
        commands.add(startCondition);

        CompoundCommand compCom = new CompoundCommand(commands);

        remoteControl.setCommand(0, startEngine);
        remoteControl.setCommand(1, compCom);
        remoteControl.buttonPress(1);
    }
}