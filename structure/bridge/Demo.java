package structure.bridge;

import structure.bridge.devices.Device;
import structure.bridge.devices.Radio;
import structure.bridge.devices.TV;
import structure.bridge.remotes.AdvancedRemote;
import structure.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());

    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new AdvancedRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
