package RAM;

public class Cor_8GB_3200 extends RAM {

    public Cor_8GB_3200() {
        description = "Corsair Vengeance LPX - 8GB, 3200MHz";
    }

    public double getCASLatency() {
        return 16;
    }

    public double powerConsumption() {
        return 0;
    }

    public double cost() {
        return 39.99;
    }
    
}
