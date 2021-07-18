package com.vvvxd.patterns_java.behavioral.state;

public class Package {
    private PackageState state;

    public PackageState getState() {
        return state;
    }

    public Package(PackageState state) {
        this.state = state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
    public void printStatus(){
        state.printStatus();
    }
    public boolean changeState() {
        if (state instanceof OrderedState ){
            setState(new DeliveredState ());
            return true;
        }else if (state instanceof DeliveredState ){
            setState(new ReceivedState ());
            return true;
        }
        return false;
    }
}
