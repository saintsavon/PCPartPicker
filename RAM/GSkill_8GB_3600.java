package RAM;

public class GSkill_8GB_3600 extends RAM {
    
    public GSkill_8GB_3600() {
        description = "G.Skill Ripjaws V - 8GB, 3600MHz";
    }

    public double getCASLatency() {
        return 19;
    }

    public double powerConsumption() {
        return 0;
    }

    public double cost() {
        return 32.99;
    }
    
}
