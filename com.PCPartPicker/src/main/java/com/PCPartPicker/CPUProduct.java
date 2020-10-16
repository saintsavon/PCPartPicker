package com.PCPartPicker;

public class CPUProduct {
	
	private String name;
	private String chipset;
	private int powerConsumption;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public CPUProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CPUProduct [name=" + name + ", chipset=" + chipset + ", powerConsumption=" + powerConsumption
				+ ", cost=" + cost + "]";
	}
	public CPUProduct(String name, String chipset, int powerConsumption, double cost) {
		super();
		this.name = name;
		this.chipset = chipset;
		this.powerConsumption = powerConsumption;
		this.cost = cost;
	}

}
