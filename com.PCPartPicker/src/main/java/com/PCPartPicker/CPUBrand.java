package com.PCPartPicker;

import java.util.Arrays;

public class CPUBrand {
	
	private String brandName;
	
	private CPUProduct[] products;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public CPUProduct[] getProducts() {
		return products;
	}

	public void setProducts(CPUProduct[] products) {
		this.products = products;
	}

	public CPUBrand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CPUBrand [brandName=" + brandName + ", products=" + Arrays.toString(products) + "]";
	}

	public CPUBrand(String brandName, CPUProduct[] products) {
		super();
		this.brandName = brandName;
		this.products = products;
	}
	

}
