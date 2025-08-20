package com.gqt.corejava.ECommerce;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Item - like Product item
abstract class Item {
	protected String productName;

	public Item(String productName) {
		super();
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public abstract String getProductDetails();
}

//interface
interface Purchase {
	double getPrice();
}

// Products
class Products extends Item implements Purchase {

	private String companyName;
	private String feature;
	private double price;
	private double rating;
	private String description;

	public Products(String productName, String companyName, String feature, double price, double rating,
			String description) {

		super(productName);

		this.companyName = companyName;
		this.feature = feature;
		this.price = price;
		this.rating = rating;
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getFeature() {
		return feature;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public String getDescription() {
		return description;
	}

//	method overriding -- polymorphism
	@Override
	public String getProductDetails() {
		return "\nProduct Name: " + getProductName() + "\nCompany Name: " + getCompanyName() + "\nFeature: "
				+ getFeature() + "\nPrice: ₹" + getPrice() + "\nRating: " + getRating() + "⭐" + "\nDescription: "
				+ getDescription();
	}

	public void showProductDetails(JFrame frame) {
		JOptionPane.showMessageDialog(frame, getProductDetails(), "Product Details", JOptionPane.INFORMATION_MESSAGE);
	}
}
