package com.PCPartPicker;

import java.util.Arrays;

public class MOBOBrand {
	
	private String brandName;
	
	private MOBOProduct[] products;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public MOBOProduct[] getProducts() {
		return products;
	}

	public void setProducts(MOBOProduct[] products) {
		this.products = products;
	}

	public MOBOBrand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MOBOBrand [brandName=" + brandName + ", products=" + Arrays.toString(products) + "]";
	}

	public MOBOBrand(String brandName, MOBOProduct[] products) {
		super();
		this.brandName = brandName;
		this.products = products;
	}

}
