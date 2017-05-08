package com.github.mahui53541.guitar.domain;

public class Guitar implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 325952505698299172L;

	private String id;
	
	private Double price;
	
	private String builder;
	
	private String model;
	
	private String type;
	
	private String backWood;
	
	private String topWood;

	public Guitar(){
		
	}
	public Guitar(String id, double price, String builder, String model, String type, String backWood, String topWood) {
		super();
		this.id = id;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	
	
	
}
