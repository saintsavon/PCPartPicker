package Intel_CPU;

public abstract class Intel_CPU {
    public enum Chipset { LGA_115X, AM4 };
    Chipset chipset = Chipset.LGA_115X;
    String description = "Unknown chipset";

    public String getDescription() {
        return description;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }

    public Chipset getChipset() {
        return this.chipset;
    }

    public abstract double powerConsumption();

    public abstract double cost();
    
}
