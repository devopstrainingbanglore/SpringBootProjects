package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class Product {
	@Transient
	public static final String SEQUENCE_NAME = "product_sequence";

	private long id;
	private String name;
	private String brand;
	private String madein;
	private float price;

	protected Product() {
	}

	protected Product(Long id, String name, String brand, String madein, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}

	@Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
