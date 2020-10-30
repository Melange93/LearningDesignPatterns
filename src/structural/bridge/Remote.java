package structural.bridge;

public abstract class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
            return;
        }
        device.enable();
    }

    public void volumeDown() {
        double percent = device.getVolume();
        device.setVolume(percent - 0.1);
    }

    public void volumeUp() {
        double percent = device.getVolume();
        device.setVolume(percent + 0.1);
    }

    public void channelDown() {
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel - 1);
    }

    public void channelUp() {
        int oldChannel = device.getChannel();
        device.setChannel(oldChannel + 1);
    }
}
