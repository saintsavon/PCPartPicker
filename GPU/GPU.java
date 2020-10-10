package GPU;

public abstract class GPU {

    public enum SlotsRequired { TWO, THREE };
    SlotsRequired slotsRequired = SlotsRequired.TWO;
    String description = "Unknown form factor";

    public String getDescription() {
        return description;
    }

    public void setSlotsRequired(SlotsRequired slotsRequired) {
        this.slotsRequired = slotsRequired;
    }

    public SlotsRequired getSlotsRequired() {
        return this.slotsRequired;
    }

    public abstract double cost();
    
}
