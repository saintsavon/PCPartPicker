public interface ComponentFactory {

    public CPU[] chooseCPU();
    public MOBO[] chooseMOBO();
    public Cooler[] chooseCooler();
	public Case[] chooseCase();
	public RAM[] chooseRAM();
	public GPU[] chooseGPU();
    public PSU[] choosePSU();
    
}
