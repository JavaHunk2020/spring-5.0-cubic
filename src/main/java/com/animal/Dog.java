package com.animal;

public class Dog {

	private String name;
	private String color;
	private int tail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", tail=" + tail + "]";
	}
}
