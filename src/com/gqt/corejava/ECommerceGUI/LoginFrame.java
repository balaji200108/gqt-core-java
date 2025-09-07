package com.gqt.corejava.ECommerceGUI;


import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class LoginFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginPage1();
	}
}
//Product CLASS
class Product {
	String name;
	String category;
	String description;
	int price;

	public Product(String name, String category, String description, int price) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}

	public String toString() {
		return name + " - ₹" + price;
	}

	public String getFullDetails() {
		return name + "\nType of Item: " + category + "\n₹" + price + "\n\n" + description;
	}
}

// LoginFrame CLASS
class LoginPage1 extends JFrame {
	JTextField username;
	JTextField email;
	JTextField contact_no;

	public LoginPage1() {
		setTitle("Login page");
		setSize(300, 300);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Username
		JLabel userLabel = new JLabel("Username:");
		userLabel.setBounds(30, 30, 80, 25);
		add(userLabel);

		username = new JTextField();
		username.setBounds(120, 30, 130, 25);
		add(username);

		// Email
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(30, 70, 80, 25);
		add(emailLabel);

		email = new JTextField();
		email.setBounds(120, 70, 130, 25);
		add(email);

		// Contact No
		JLabel contactLabel = new JLabel("Contact No:");
		contactLabel.setBounds(30, 110, 80, 25);
		add(contactLabel);

		contact_no = new JTextField();
		contact_no.setBounds(120, 110, 130, 25);
		add(contact_no);

		// Login Button
		JButton loginBtn = new JButton("Login");
		loginBtn.setBounds(90, 200, 100, 30);
		add(loginBtn);

		loginBtn.addActionListener(e -> {
			String enteredUser = username.getText().trim();
			String enteredEmailId = new String(email.getText());

			String validUser = "balaji";
			String validEmail = "bch626249@gmail.com";

			if (enteredUser.equals(validUser) && enteredEmailId.equals(validEmail)) {
				new HomePage();
				dispose();
			} else {
				JOptionPane.showMessageDialog(this,"Invalid login!");
			}
		});

		setVisible(true);
	}
}

class HomePage extends JFrame{
	JComboBox<String> categories;
	JComboBox<String> sub_categories;
	DefaultListModel<Product> productListModel;
	JList<Product> productJList;
	JTextArea descriptionArea;
	List<Product> allProducts = new ArrayList<>();
	List<Product> cart = new ArrayList<>();


	String [] categories1= {"All","Electronics","Furniture","Clothing","Groceries"};
	String [][] sub_categories1= {{""},
			{"Mobiles","Laptops","Cameras","Chargers","Speakers"},
			{"Office Chairs","Beds","Dinning Sets","Laptop Tables","Office tables"},
			{"Men","Women","Children","Boys","Girls"},
			{"Fruits","vegetables","Snacks","Beverages","Dairy"}
	};

	public HomePage() {
		setTitle("HomePage E-commerce website");
		setSize(700, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JLabel catLabel = new JLabel("Categories:");
		catLabel.setBounds(30, 30, 100, 25);
		add(catLabel);
		categories = new JComboBox<>(categories1);
		categories.setBounds(150, 30, 150, 25);
		add(categories);
		JLabel subCatLabel = new JLabel("Sub-categories:");
		subCatLabel.setBounds(30, 70, 100, 25);
		add(subCatLabel);
		sub_categories = new JComboBox<>(sub_categories1[0]);
		sub_categories.setBounds(150, 70, 150, 25);
		add(sub_categories);

		// Add ActionListener to update subCategories
		categories.addActionListener(e -> {
			int index = categories.getSelectedIndex(); 
			sub_categories.setModel(new DefaultComboBoxModel<>(sub_categories1[index]));
		});


		productListModel = new DefaultListModel<>();
		productJList = new JList<>(productListModel);
		JScrollPane productScroll = new JScrollPane(productJList);
		productScroll.setBounds(20, 100, 250, 300);
		add(productScroll);
		JButton addToCart = new JButton("Add to Cart");
		addToCart.setBounds(80, 420, 150, 30);
		add(addToCart);

		descriptionArea = new JTextArea();
		descriptionArea.setEditable(false);
		JScrollPane descScroll = new JScrollPane(descriptionArea);
		descScroll.setBounds(290, 100, 270, 300);
		add(descScroll);

		JButton viewCart = new JButton("View Cart");
		viewCart.setBounds(320, 420, 150, 30);
		add(viewCart);

		loadProducts();
		displayProducts("All");

		productJList.addListSelectionListener(e -> {
			Product selected = productJList.getSelectedValue();
			if (selected != null) {
				descriptionArea.setText(selected.getFullDetails());
			}
		});

		sub_categories.addActionListener(e -> {
			String selectedCat = (String) sub_categories.getSelectedItem();
			displayProducts(selectedCat);
		});

		addToCart.addActionListener(e -> {
			Product selected = productJList.getSelectedValue();
			if (selected != null) {
				cart.add(selected);
				JOptionPane.showMessageDialog(this, "Added to cart!");
			}
		});

		viewCart.addActionListener(e -> new CartFrame(cart));

		setVisible(true);

	}
	void loadProducts() {
		allProducts.add(new Product("iPhone 14", "Mobiles", "Latest iPhone with A15 Bionic.", 79999));
		allProducts.add(new Product("Samsung Galaxy S23", "Mobiles", "Flagship phone with Snapdragon 8 Gen2.", 74999));
		allProducts.add(new Product("OnePlus Nord CE", "Mobiles", "Affordable 5G smartphone.", 25999));
		allProducts.add(new Product("Redmi Note 12", "Mobiles", "Budget phone with AMOLED display.", 15999));
		allProducts.add(new Product("Realme Narzo", "Mobiles", "Entry-level gaming phone.", 12999));

		allProducts.add(new Product("MacBook Air", "Laptops", "13-inch M1 chip laptop.", 99999));
		allProducts.add(new Product("Dell XPS 13", "Laptops", "Compact premium laptop.", 89999));
		allProducts.add(new Product("HP Pavilion", "Laptops", "Everyday performance laptop.", 59999));
		allProducts.add(new Product("Lenovo ThinkPad", "Laptops", "Business laptop with durability.", 84999));
		allProducts.add(new Product("Asus ROG", "Laptops", "Gaming beast with RTX graphics.", 119999));

		allProducts.add(new Product("Canon EOS 1500D", "Cameras", "DSLR camera with 24.1 MP.", 39999));
		allProducts.add(new Product("Nikon D3500", "Cameras", "Beginner DSLR with 18-55mm lens.", 42999));
		allProducts.add(new Product("Sony Alpha 7", "Cameras", "Mirrorless full-frame camera.", 124999));
		allProducts.add(new Product("GoPro Hero 11", "Cameras", "Action camera 5.3K recording.", 49999));
		allProducts.add(new Product("Fujifilm Instax", "Cameras", "Instant print polaroid camera.", 9999));

		allProducts.add(new Product("Samsung 25W", "Chargers", "Fast charger USB-C.", 1499));
		allProducts.add(new Product("Apple 20W", "Chargers", "Original iPhone charger.", 1799));
		allProducts.add(new Product("Anker 65W", "Chargers", "Multi-device fast charger.", 3999));
		allProducts.add(new Product("Mi 33W Sonic", "Chargers", "Affordable fast charging adapter.", 999));
		allProducts.add(new Product("Realme 50W", "Chargers", "VOOC charger for Realme devices.", 2499));

		allProducts.add(new Product("JBL Flip 6", "Speakers", "Portable Bluetooth speaker.", 8999));
		allProducts.add(new Product("Sony XB13", "Speakers", "Compact extra bass speaker.", 4999));
		allProducts.add(new Product("Boat Stone 650", "Speakers", "Rugged speaker 10hrs battery.", 1999));
		allProducts.add(new Product("Marshall Emberton", "Speakers", "Premium vintage design speaker.", 16999));
		allProducts.add(new Product("Echo Dot 5th Gen", "Speakers", "Smart Alexa speaker.", 4499));

		allProducts.add(new Product("Ergonomic Chair", "Office Chairs", "Mesh back support ergonomic chair.", 5499));
		allProducts.add(new Product("Revolving Chair", "Office Chairs", "Comfortable revolving chair with cushion seat.", 4599));
		allProducts.add(new Product("Executive Chair", "Office Chairs", "Premium leather executive chair.", 8999));
		allProducts.add(new Product("Folding Chair", "Office Chairs", "Portable foldable chair for offices.", 1999));
		allProducts.add(new Product("Visitor Chair", "Office Chairs", "Cushioned chair for visitors.", 2999));

		allProducts.add(new Product("King Size Bed", "Beds", "Wooden king size bed with storage.", 24999));
		allProducts.add(new Product("Queen Size Bed", "Beds", "Modern queen size bed with headboard.", 19999));
		allProducts.add(new Product("Single Bed", "Beds", "Compact single bed for kids.", 9999));
		allProducts.add(new Product("Sofa Cum Bed", "Beds", "Convertible sofa cum bed.", 14999));
		allProducts.add(new Product("Bunk Bed", "Beds", "Two-tier bunk bed for kids.", 12999));

		allProducts.add(new Product("4-Seater Dining Set", "Dining Sets", "Wooden 4-seater dining set.", 15999));
		allProducts.add(new Product("6-Seater Dining Set", "Dining Sets", "Classic 6-seater dining table with chairs.", 22999));
		allProducts.add(new Product("Glass Dining Table", "Dining Sets", "Glass top dining table for 4.", 17999));
		allProducts.add(new Product("Round Dining Table", "Dining Sets", "Compact round dining set for 2.", 8999));
		allProducts.add(new Product("Luxury Dining Set", "Dining Sets", "Premium 8-seater luxury dining set.", 34999));

		allProducts.add(new Product("Foldable Laptop Table", "Laptop Tables", "Portable foldable laptop desk.", 1499));
		allProducts.add(new Product("Adjustable Laptop Table", "Laptop Tables", "Height adjustable study/laptop table.", 2499));
		allProducts.add(new Product("Wooden Laptop Table", "Laptop Tables", "Classic wooden laptop table.", 1999));
		allProducts.add(new Product("Bed Laptop Table", "Laptop Tables", "Laptop table with cup holder for bed use.", 1299));
		allProducts.add(new Product("Ergonomic Laptop Stand", "Laptop Tables", "Laptop stand with ergonomic design.", 1799));

		allProducts.add(new Product("Executive Office Table", "Office Tables", "Spacious wooden office desk.", 8999));
		allProducts.add(new Product("Computer Desk", "Office Tables", "Compact desk for computer setup.", 4999));
		allProducts.add(new Product("L-Shaped Office Table", "Office Tables", "L-shaped desk with drawers.", 12999));
		allProducts.add(new Product("Workstation Table", "Office Tables", "Workstation desk for 2 people.", 15999));
		allProducts.add(new Product("Writing Desk", "Office Tables", "Minimal wooden writing desk.", 3499));

		allProducts.add(new Product("Men T-Shirt", "Men", "Casual cotton t-shirt", 599));
		allProducts.add(new Product("Men Jeans", "Men", "Slim fit blue jeans", 1299));
		allProducts.add(new Product("Men Jacket", "Men", "Winter wear jacket", 2499));
		allProducts.add(new Product("Men Shoes", "Men", "Sports running shoes", 1999));
		allProducts.add(new Product("Men Watch", "Men", "Analog wristwatch", 1499));

		allProducts.add(new Product("Women Kurti", "Women", "Cotton embroidered kurti", 799));
		allProducts.add(new Product("Women Saree", "Women", "Silk festive saree", 3499));
		allProducts.add(new Product("Women Handbag", "Women", "Leather stylish handbag", 2299));
		allProducts.add(new Product("Women Heels", "Women", "High-heel sandals", 1899));
		allProducts.add(new Product("Women Necklace", "Women", "Gold-plated fashion necklace", 999));

		allProducts.add(new Product("Children T-Shirt", "Children", "Cartoon print t-shirt", 399));
		allProducts.add(new Product("Children Shorts", "Children", "Cotton summer shorts", 499));
		allProducts.add(new Product("Children School Bag", "Children", "Lightweight school backpack", 899));
		allProducts.add(new Product("Children Shoes", "Children", "Sports shoes for kids", 1199));
		allProducts.add(new Product("Children Sweater", "Children", "Woolen winter sweater", 699));

		allProducts.add(new Product("Boys Shirt", "Boys", "Checked cotton shirt", 699));
		allProducts.add(new Product("Boys Jeans", "Boys", "Casual denim jeans", 999));
		allProducts.add(new Product("Boys Sneakers", "Boys", "Stylish sneakers", 1599));
		allProducts.add(new Product("Boys Jacket", "Boys", "Winter casual jacket", 1799));
		allProducts.add(new Product("Boys Cap", "Boys", "Baseball style cap", 299));

		allProducts.add(new Product("Girls Dress", "Girls", "Party wear frock", 1499));
		allProducts.add(new Product("Girls Leggings", "Girls", "Cotton printed leggings", 499));
		allProducts.add(new Product("Girls Hairband", "Girls", "Fashion hair accessory", 199));
		allProducts.add(new Product("Girls Shoes", "Girls", "Ballerina shoes", 899));
		allProducts.add(new Product("Girls Jacket", "Girls", "Stylish denim jacket", 1299));

		allProducts.add(new Product("Apple", "Fruits", "Fresh red apples, 1kg.", 120));
		allProducts.add(new Product("Banana", "Fruits", "Organic bananas, dozen.", 60));
		allProducts.add(new Product("Mango", "Fruits", "Alphonso mangoes, 1kg.", 250));
		allProducts.add(new Product("Orange", "Fruits", "Juicy oranges, 1kg.", 90));
		allProducts.add(new Product("Grapes", "Fruits", "Green seedless grapes, 500g.", 80));

		allProducts.add(new Product("Tomato", "Vegetables", "Fresh red tomatoes, 1kg.", 40));
		allProducts.add(new Product("Potato", "Vegetables", "Premium quality potatoes, 1kg.", 35));
		allProducts.add(new Product("Onion", "Vegetables", "Farm fresh onions, 1kg.", 50));
		allProducts.add(new Product("Carrot", "Vegetables", "Crunchy carrots, 1kg.", 70));
		allProducts.add(new Product("Spinach", "Vegetables", "Green leafy spinach, bunch.", 30));

		allProducts.add(new Product("Chips", "Snacks", "Potato chips, 200g pack.", 50));
		allProducts.add(new Product("Biscuits", "Snacks", "Chocolate cream biscuits, 150g.", 30));
		allProducts.add(new Product("Namkeen", "Snacks", "Indian spicy mixture, 250g.", 70));
		allProducts.add(new Product("Popcorn", "Snacks", "Butter popcorn, 100g.", 40));
		allProducts.add(new Product("Chocolate", "Snacks", "Milk chocolate bar, 100g.", 80));

		allProducts.add(new Product("Cola", "Beverages", "500ml soft drink.", 40));
		allProducts.add(new Product("Orange Juice", "Beverages", "1L packaged orange juice.", 120));
		allProducts.add(new Product("Green Tea", "Beverages", "100g pack of green tea.", 150));
		allProducts.add(new Product("Coffee", "Beverages", "Instant coffee, 200g jar.", 300));
		allProducts.add(new Product("Milkshake", "Beverages", "Chocolate milkshake, 500ml.", 90));

		allProducts.add(new Product("Milk", "Dairy", "Toned milk, 1L pack.", 60));
		allProducts.add(new Product("Cheese", "Dairy", "Processed cheese block, 200g.", 120));
		allProducts.add(new Product("Curd", "Dairy", "Fresh curd, 500g.", 50));
		allProducts.add(new Product("Butter", "Dairy", "Salted butter, 100g.", 55));
		allProducts.add(new Product("Paneer", "Dairy", "Cottage cheese, 200g.", 90));
	}
	void displayProducts(String category) {
		productListModel.clear();
		for (Product p : allProducts) {
			if (category.equals("All") || p.category.equalsIgnoreCase(category)) {
				productListModel.addElement(p);
			}
		}
	}
}
//CartFrame CLASS
class CartFrame extends JFrame {
	JTextArea cartArea;
	JButton buyNowButton;
	List<Product> cartItems;

	public CartFrame(List<Product> cartItems) {
		this.cartItems = cartItems;

		setTitle("Your Cart");
		setSize(350, 450);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		cartArea = new JTextArea();
		cartArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(cartArea);
		scrollPane.setBounds(20, 20, 300, 300);
		add(scrollPane);
		JButton continueshopping= new JButton("Back to shop");
		continueshopping.setBounds(40,340,120,40);
		add(continueshopping);
		
		continueshopping.addActionListener(e->dispose());

		buyNowButton = new JButton("Buy Now");
		buyNowButton.setBounds(170, 340, 120, 40);
		add(buyNowButton);

		buyNowButton.addActionListener(e -> new Invoice(cartItems));

		showCart();
		setVisible(true);
	}

	private void showCart() {
		if (cartItems.isEmpty()) {
			cartArea.setText("Your cart is empty.");
			buyNowButton.setEnabled(false);
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Items in your cart:\n\n");

		for (Product p : cartItems) {
			sb.append(p.name).append(" - ₹").append(p.price).append("\n");
		}

		cartArea.setText(sb.toString());
	}
}

//Invoice CLASS
class Invoice extends JFrame {
	public Invoice(List<Product> purchasedItems) {
		setTitle("Invoice");
		setSize(350, 400);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		JTextArea invoiceDisplay = new JTextArea();
		invoiceDisplay.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(invoiceDisplay);
		scrollPane.setBounds(20, 20, 300, 280);
		add(scrollPane);
		
		JButton continueshopping= new JButton("Back to shop");
		continueshopping.setBounds(30,320,130,30);
		add(continueshopping);
		
		continueshopping.addActionListener(e->dispose());

		JButton closeButton = new JButton("Close");
		closeButton.setBounds(180, 320, 130, 30);
		add(closeButton);

		closeButton.addActionListener(e -> dispose());

		int total = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("-------- Invoice --------\n\n");

		for (Product p : purchasedItems) {
			sb.append(p.name).append(" - ₹").append(p.price).append("\n");
			total += p.price;
		}

		sb.append("\n-------------------------\n");
		sb.append("Total: ₹").append(total);

		invoiceDisplay.setText(sb.toString());

		setVisible(true);
	}
}
