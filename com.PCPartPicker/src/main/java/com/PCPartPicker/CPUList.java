package com.PCPartPicker;

import java.util.Arrays;

public class CPUList {

	private CPUBrand[] brands;

	public CPUBrand[] getBrands() {
		return brands;
	}

	public void setBrands(CPUBrand[] brands) {
		this.brands = brands;
	}

	public CPUList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CPUList [brands=" + Arrays.toString(brands) + "]";
	}

	public CPUList(CPUBrand[] brands) {
		super();
		this.brands = brands;
	}

}
