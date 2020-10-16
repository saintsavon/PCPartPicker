package com.PCPartPicker;

public class PCPartsList {

	private CPUList cpu;
	private MOBOList mobo;

	public CPUList getCpu() {
		return cpu;
	}

	public void setCpu(CPUList cpu) {
		this.cpu = cpu;
	}
	
	public MOBOList getMobo() {
		return mobo;
	}
	
	public void setMobo(MOBOList mobo) {
		this.mobo = mobo;
	}

	public PCPartsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PCPartsList [CPU=" + cpu + "MOBO=" + mobo + "]";
	}

	public PCPartsList(CPUList cpu) {
		super();
		this.cpu = cpu;
	}
	
	public PCPartsList(MOBOList mobo) {
		super();
		this.mobo = mobo;
	}

}
