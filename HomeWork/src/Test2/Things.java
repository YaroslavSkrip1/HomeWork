package Test2;

import Interface.SummerThings;
import Interface.WinterThings;

public abstract class Things implements WinterThings, SummerThings {
	
	private String brand;
	private String type;
	private String color;
	
	public Things (String type) {
	this.type = type;
	
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Things [brand=" + brand + ", type=" + type + ", color=" + color + "]";
	}


	
}
