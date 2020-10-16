package com.PCPartPicker;

public class MOBOProduct {
	
	private String name;
	private String chipset;
	private String formFactor;
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
	public String getFormFactor() {
		return formFactor;
	}
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public MOBOProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MOBOProduct [name=" + name + ", chipset=" + chipset + ", formFactor=" + formFactor + ", cost=" + cost
				+ "]";
	}
	public MOBOProduct(String name, String chipset, String formFactor, double cost) {
		super();
		this.name = name;
		this.chipset = chipset;
		this.formFactor = formFactor;
		this.cost = cost;
	}

}
