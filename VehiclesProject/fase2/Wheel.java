package com.vehicles.project.fase2;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Wheel){
			Wheel other=(Wheel)obj;
			return brand.equals(other.brand) && other.diameter==diameter;
			
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", diameter=" + diameter + "]";
	}
	
}
