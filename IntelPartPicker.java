import Intel_CPU.i5_9600K;
import Intel_CPU.i7_9700K;
import Intel_CPU.i9_9900K;

public class IntelPartPicker implements ComponentFactory {
    
    public CPU[] chooseCPU() {
        CPU cpu[] = new {
            new i5_9600K(),
            new i7_9700K(),
            new i9_9900K()
        };
    }
}
