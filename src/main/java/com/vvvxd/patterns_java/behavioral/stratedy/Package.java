package com.vvvxd.patterns_java.behavioral.stratedy;

public class Package {
    private PackageState state;

    public void setState(PackageState state) {
        this.state = state;
    }
    public void printStatus() {
        state.printStatus();
    }

}
