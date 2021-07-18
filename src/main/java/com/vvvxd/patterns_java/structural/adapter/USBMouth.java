package com.vvvxd.patterns_java.structural.adapter;

public class USBMouth implements USB{
    @Override
    public void connectWithUsbCable() {
        System.out.println("connect USB Mouth");
    }
}
