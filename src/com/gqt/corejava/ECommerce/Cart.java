package com.gqt.corejava.ECommerce;


import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cart {
	private ArrayList<Products> items;
	private JFrame frame;

	public Cart(JFrame frame) {
		items = new ArrayList<>();
		this.frame = frame;
	}

	public void addToCart(Products p) {
		items.add(p);
		JOptionPane.showMessageDialog(frame, "The Product \"" + p.getProductName());
		return;
	}

	public void viewCart() {

		if (items.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "Oops! Your cart is empty.");
			return;
		}

		double total = 0;
		StringBuilder cartDetails = new StringBuilder();

		for (int i = 0; i < items.size(); i++) {
			Products p = items.get(i);
			cartDetails.append((i + 1) + ". " + p.getProductDetails());
			total += p.getPrice();
		}

		cartDetails.append("\nTotal Price: " + total);
		JOptionPane.showMessageDialog(frame, cartDetails.toString() + "\n", "Your Cart",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void checkOut(String userName, double total) {
		if (items.isEmpty()) {
			JOptionPane.showMessageDialog(frame,
					"Oops! Your cart is empty. " + "Add items to your cart before checkout.");
			return;
		}
		viewCart();
		JOptionPane.showMessageDialog(frame,
				"Thank you " + userName + "!\nYour order of ₹" + total + " has been placed successfully.",
				"Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
		items.clear();
	}

}
