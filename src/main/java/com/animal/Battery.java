package com.animal;

public class Battery {
	private String power;
	private int price;

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Battery [power=" + power + ", price=" + price + "]";
	}

}
