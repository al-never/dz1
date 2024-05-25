package ru.alnever.dz1.usb;

public class Computer {
    public void seeDataMemoryCard(USB usb) {
        System.out.println("Reading data...\n" + usb.readData());
    }
}
