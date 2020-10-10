package RAM;

public abstract class RAM {
    public enum ClockSpeed { MHz_3600, MHz_3200 };
    ClockSpeed clockSpeed = ClockSpeed.MHz_3200;
    String description = "Unknown clockspeed";

    public String getDescription() {
        return description;
    }

    public void setClockSpeed(ClockSpeed clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public ClockSpeed getClockSpeed() {
        return this.clockSpeed;
    }

    public abstract double cost();
    
}
