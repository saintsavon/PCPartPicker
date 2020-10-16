package com.PCPartPicker;

public class PCPartsList {

	private CPUList cpu;

	public CPUList getCpu() {
		return cpu;
	}

	public void setCpu(CPUList cpu) {
		this.cpu = cpu;
	}

	public PCPartsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PCPartsList [CPU=" + cpu + "]";
	}

	public PCPartsList(CPUList cpu) {
		super();
		this.cpu = cpu;
	}

}
