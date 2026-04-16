package TheBrigdePattern;

public class Remote {protected Device device;

public Remote(Device device) {
    this.device = device;
}

public void togglePower() {
    if (device.isEnabled()) {
        device.disable();
        System.out.println("Device is OFF");
    } else {
        device.enable();
        System.out.println("Device is ON");
    }
}

public void volumeUp() {
    device.setVolume(device.getVolume() + 10);
    System.out.println("Volume up: " + device.getVolume());
}

}
