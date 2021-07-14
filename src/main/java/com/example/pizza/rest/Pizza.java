package com.example.pizza.rest;

public class Pizza {

	private String type;
	private int size;

	private String baseType;

	public Pizza(String type, int size, String baseType) {
		super();
		this.type = type;
		this.size = size;
		this.baseType = baseType;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	@Override
	public String toString() {
		return "Pizza[type=" + type + ", size=" + baseType + "]";
	}
}
