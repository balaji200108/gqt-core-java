package com.gqt.corejava.ECommerce;

class SubCategories{
	String name;
	Products products[];
	
	public SubCategories(String name, Products[] product) {
		super();
		this.name = name;
		this.products = product;
	}

	public String getName() {
		return name;
	}

	public Products[] getProducts() {
		return products;
	}
}