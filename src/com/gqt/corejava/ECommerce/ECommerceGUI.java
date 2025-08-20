package com.gqt.corejava.ECommerce;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ECommerceGUI {

	private JFrame frame;
	private String currentUserName;
	private String mobile;
	private String currentUserEmail;
	private Cart cart;

	public ECommerceGUI() {
		frame = new JFrame("E-Commerce App");
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		customerLogin();

		frame.setVisible(true);
	}

	private Categories[] getAllCategories() {
		return new Categories[] { DataStore.getElectronicsCategory(), DataStore.getFurnitureCategory(),
				DataStore.getClothingCategory(), DataStore.getGroceriesCategory() };
	}

	void customerLogin() {

		JPanel panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.anchor = GridBagConstraints.WEST;

		JLabel greetings = new JLabel("Welcome to the E-Commerce App.. ");
		greetings.setFont(new Font("Verdana", Font.BOLD, 24));
		greetings.setForeground(new Color(0, 102, 204));

		JLabel info = new JLabel("Login here by entering your Details.. ");
		info.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));

		info.setForeground(Color.DARK_GRAY);

		JLabel userName = new JLabel("Username ");
		userName.setFont(new Font("Serif", Font.BOLD, 14));
		userName.setForeground(Color.BLACK);
		JTextField UsernameField = new JTextField(20);
		UsernameField.setPreferredSize(new Dimension(500, 30));

		JLabel usermobile = new JLabel("Mobile No ");
		usermobile.setFont(new Font("Serif", Font.BOLD, 14));
		usermobile.setForeground(Color.BLACK);
		JTextField UsermobileField = new JTextField(20);
		UsermobileField.setPreferredSize(new Dimension(500, 30));

		JLabel userEmail = new JLabel("Email ");
		userEmail.setFont(new Font("Serif", Font.BOLD, 14));
		userEmail.setForeground(Color.BLACK);
		JTextField UserEmailField = new JTextField(20);
		UserEmailField.setPreferredSize(new Dimension(500, 30));

		JButton loginbtn = new JButton("Login");
		loginbtn.setBackground(new Color(255, 160, 0));
		loginbtn.setForeground(Color.BLACK);

		// Row 0 - Greeting
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(greetings, gbc);

		// Row 1 - Info
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(5, 5, 20, 5); // adding the space 20(padding) is bottom
		panel.add(info, gbc);

		// Row 2 - Username
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets = new Insets(5, 5, 5, 5); // back to the normal padding
		panel.add(userName, gbc);

		gbc.gridx = 1;
		panel.add(UsernameField, gbc);

		// Row 3 - Mobile
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(usermobile, gbc);

		gbc.gridx = 1;
		panel.add(UsermobileField, gbc);

		// Row 4 - Email
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel.add(userEmail, gbc);

		gbc.gridx = 1;
		panel.add(UserEmailField, gbc);

		// Row 5 - Button
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		panel.add(loginbtn, gbc);

		frame.getContentPane().add(panel);

		loginbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentUserName = UsernameField.getText();
				mobile = UsermobileField.getText();
				currentUserEmail = UserEmailField.getText();
				cart = new Cart(frame);

				if (currentUserName.matches("[A-Za-z]+") && mobile.matches("\\d{10}")
						&& currentUserEmail.contains("@gmail.com")) {
					JOptionPane.showMessageDialog(panel, "Login Successful!");

					showCategoriesScreen();
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid Login. Please check your username or email.");
				}
			}
		});
	}

	void showCategoriesScreen() {

		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 40));

		// title with space alignment..
		JLabel title = new JLabel("CATEGORIES");
		title.setForeground(new Color(0, 102, 204));
		title.setFont(new Font("Times New Roman", Font.BOLD, 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(60, 0, 60, 0));
		frame.add(title, BorderLayout.NORTH);

		// welcomt text in lable(added into the seperate panel name as centerPanel) with
		// space alignment..
		JLabel welcome = new JLabel("Browse through the top products in this category and pick your favorite!",
				JLabel.CENTER);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcome.setForeground(new Color(255, 69, 0));
		welcome.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.add(welcome, BorderLayout.NORTH);

		Categories[] categories = getAllCategories();
		for (Categories cat : categories) {
			JButton btn = new JButton(cat.getName());
			btn.setPreferredSize(new Dimension(230, 170));
			btn.addActionListener(e -> showSubCategoriesScreen(cat));
			panel.add(btn);
		}

		centerPanel.add(panel, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.revalidate();
	}

	void showSubCategoriesScreen(Categories cat) {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 50));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		JLabel title = new JLabel("SUBCATEGORIES in " + cat.getName());
		title.setFont(new Font("Times New Roman", Font.BOLD, 24));
		title.setForeground(new Color(0, 102, 204));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(60, 0, 60, 0));
		frame.add(title, BorderLayout.NORTH);

		JLabel welcome = new JLabel(
				"These are the trending categories of products. " + "Select your category and start shopping!",
				JLabel.CENTER);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcome.setForeground(new Color(255, 69, 0));
		welcome.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.add(welcome, BorderLayout.NORTH);

		SubCategories[] subCategories = cat.getSubCategories();

		for (SubCategories subCat : subCategories) {
			JButton btn = new JButton(subCat.getName());
			btn.setPreferredSize(new Dimension(170, 130));
			btn.addActionListener(e -> showProductsScreen(subCat));
			panel.add(btn);
		}

		JButton backBtn = new JButton("Back");
		backBtn.setPreferredSize(new Dimension(200, 50));
		backBtn.addActionListener(e -> showCategoriesScreen());
		panel.add(backBtn);

		centerPanel.add(panel, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.revalidate();
	}

	void showProductsScreen(SubCategories subCat) {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 50));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		JLabel title = new JLabel("PRODUCTS in " + subCat.getName());
		title.setFont(new Font("Times New Roman", Font.BOLD, 24));
		title.setForeground(new Color(0, 102, 204));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(60, 0, 60, 0));
		frame.add(title, BorderLayout.NORTH);

		JLabel welcome = new JLabel(
				"Explore the best products in " + subCat.getName() + ". Choose your favorite and start shopping!",
				JLabel.CENTER);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcome.setForeground(new Color(255, 69, 0));
		welcome.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.add(welcome, BorderLayout.NORTH);

		Products[] products = subCat.getProducts();

		for (Products prod : products) {
			JButton btn = new JButton(prod.getProductName());
			btn.setPreferredSize(new Dimension(170, 130));
			btn.addActionListener(e -> showProductOptionsScreen(prod));
			panel.add(btn);
		}

		JButton backBtn = new JButton("Back");
		backBtn.setPreferredSize(new Dimension(200, 50));
		backBtn.addActionListener(e -> showCategoriesScreen());
		panel.add(backBtn);

		centerPanel.add(panel, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.revalidate();
	}

	void showProductOptionsScreen(Products prod) {
		frame.getContentPane().removeAll();
		frame.repaint();
		frame.setLayout(new BorderLayout());

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 50));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		JLabel title = new JLabel(prod.getProductName());
		title.setForeground(new Color(0, 102, 204));
		title.setFont(new Font("Times New Roman", Font.BOLD, 24));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(60, 0, 60, 0));
		frame.add(title, BorderLayout.NORTH);

		JLabel welcome = new JLabel(
				"Discover details, compare options, " + "and proceed to purchase your selected product.",
				JLabel.CENTER);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcome.setForeground(new Color(255, 69, 0));
		welcome.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

		JPanel centerPanel = new JPanel(new BorderLayout());
		centerPanel.add(welcome, BorderLayout.NORTH);

		JTextArea productInfomatin = new JTextArea(3, 20);  
		productInfomatin.setText(prod.getProductDetails() + "\t" + prod.getPrice());
		productInfomatin.setFont(new Font("Serif", Font.PLAIN, 16));
		productInfomatin.setEditable(false); 
		productInfomatin.setLineWrap(true); 
		productInfomatin.setWrapStyleWord(true);
		productInfomatin.setBackground(new Color(245, 222, 179)); 
		productInfomatin.setForeground(Color.BLACK);
		
		JScrollPane Scroll = new JScrollPane(productInfomatin);
		Scroll.setBorder(BorderFactory.createTitledBorder("Product Information"));
		Scroll.setPreferredSize(new Dimension(250, 50));

		centerPanel.add(Scroll, BorderLayout.WEST);
		centerPanel.add(panel, BorderLayout.CENTER);

		JButton addToCartBtn = new JButton("Add to Cart");
		addToCartBtn.setPreferredSize(new Dimension(200, 150));
		addToCartBtn.addActionListener(e -> {
			cart.addToCart(prod);
			JOptionPane.showMessageDialog(frame, "Added to Cart!");
			showCategoriesScreen();
		});

		JButton buyNowBtn = new JButton("Buy Now");
		buyNowBtn.setPreferredSize(new Dimension(200, 150));
		buyNowBtn.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, prod.getProductDetails() + "\nTotal Price: " + prod.getPrice());
			showCategoriesScreen();
		});

		JButton checkoutBtn = new JButton("Checkout");
		checkoutBtn.setPreferredSize(new Dimension(200, 150));
		checkoutBtn.addActionListener(e -> {
			cart.checkOut(currentUserName,prod.getPrice());
			showCategoriesScreen();
		});

		panel.add(addToCartBtn);
		panel.add(buyNowBtn);
		panel.add(checkoutBtn);
		
		centerPanel.add(panel, BorderLayout.CENTER);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.revalidate();
	}

}
