package com.vvvxd.patterns_java.behavioral.command;

import java.util.ArrayList;
import java.util.List;

class CompoundCommand implements Command{
    private List<Command> commands = new ArrayList();

    public CompoundCommand(List commands){
        this.commands = commands;
    }

    public void execute(){
        for(Command command : commands){
            command.execute();
        }
    }
}