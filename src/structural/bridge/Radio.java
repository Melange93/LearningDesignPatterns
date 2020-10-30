package structural.bridge;

public class Radio implements Device {
    private boolean enabled;
    private double volume;
    private int channel;

    public Radio() {
        this.enabled = false;
        this.volume = 10;
        this.channel = 1;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(double percent) {
        if (this.volume > 0) {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        if (this.channel > 0) {
            this.channel = channel;
        }
    }
}
