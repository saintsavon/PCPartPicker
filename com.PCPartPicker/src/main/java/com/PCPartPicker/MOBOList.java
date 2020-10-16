package com.PCPartPicker;

import java.util.Arrays;

public class MOBOList {
	
	private MOBOBrand[] brands;

	public MOBOBrand[] getBrands() {
		return brands;
	}

	public void setBrands(MOBOBrand[] brands) {
		this.brands = brands;
	}

	public MOBOList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MOBOList [brands=" + Arrays.toString(brands) + "]";
	}

	public MOBOList(MOBOBrand[] brands) {
		super();
		this.brands = brands;
	}

}
