package GPU;

public class Nvidia_3080 extends GPU {
    
    public Nvidia_3080() {
        description = "Nvidia 3080 FE";
    }

    public double powerConsumption() {
        return 350;
    }
    
    public double cost() {
        return 699.99;
    }
}
