package com.animal;

public class Laptop {

	private String name;
	private int price;
	private String color;
	private Battery battery;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", color=" + color + ", battery=" + battery + "]";
	}

}
