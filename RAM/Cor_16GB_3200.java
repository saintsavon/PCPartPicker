package RAM;

public class Cor_16GB_3200 extends RAM {

    public Cor_16GB_3200() {
        description = "Corsair Vengeance LPX - 16GB, 3200MHz";
    }

    public double getCASLatency() {
        return 16;
    }

    public double powerConsumption() {
        return 0;
    }

    public double cost() {
        return 62.99;
    }
    
}
