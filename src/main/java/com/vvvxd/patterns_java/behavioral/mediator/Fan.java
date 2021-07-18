package com.vvvxd.patterns_java.behavioral.mediator;

public class Fan implements ElectricalDevice{
    private Mediator mediator;
    private boolean isOn = false;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Fan(Mediator mediator, boolean isOn) {
        this.mediator = mediator;
        this.isOn = isOn;
    }


    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
