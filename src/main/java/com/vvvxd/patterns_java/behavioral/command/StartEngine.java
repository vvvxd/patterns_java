package com.vvvxd.patterns_java.behavioral.command;

class StartEngine implements Command{
    private Engine engine;

    public StartEngine(Engine engine){
        this.engine = engine;
    }

    public void execute(){
        engine.start();
    }
}
