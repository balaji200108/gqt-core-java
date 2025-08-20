
package com.gqt.corejava.ECommerce;
class Categories {
	String name;
	SubCategories subCategories[];
	
	public Categories(String name, SubCategories[] subCategories) {
		super();
		this.name = name;
		this.subCategories = subCategories;
	}

	public String getName() {
		return name;
	}

	public SubCategories[] getSubCategories() {
		return subCategories;
	}	
	
}

