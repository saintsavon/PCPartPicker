package com.PCPartPicker;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class PCPartPickerMain {

	public static void main(String[] args) {

		ObjectMapper om = new ObjectMapper();
		
		try {
			PCPartsList ppl = om.readValue(new InputStreamReader(new FileInputStream("parts.json")), PCPartsList.class);
			//System.out.println(ppl);
			//System.out.println(ppl.getCpu().getBrands()[1].getBrandName());
			
			for (CPUBrand brand: ppl.getCpu().getBrands()) {
				if (brand.getBrandName().equals("intel")) {
					System.out.println(brand);
				} else if (brand.getBrandName().equals("amd")){
					System.out.println(brand);
				} else {
					System.out.checkError();
				}
			}
			
			for (MOBOBrand brand: ppl.getMobo().getBrands()) {
				if (brand.getBrandName().equals("intel")) {
					System.out.println(brand);
				} else if (brand.getBrandName().equals("amd")){
					System.out.println(brand);
				} else {
					System.out.checkError();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
