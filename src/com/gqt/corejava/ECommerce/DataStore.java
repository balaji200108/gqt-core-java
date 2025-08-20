package com.gqt.corejava.ECommerce;

public class DataStore {
//	ElectronicsCategory

    public static Categories getElectronicsCategory() {
        Products[] mobiles = {
            new Products("iPhone 14", "Apple", "128GB, Dual Camera", 70000, 4.7, "Latest iPhone with amazing camera"),
            new Products("Samsung Galaxy S22", "Samsung", "256GB, Triple Camera", 65000, 4.6, "Flagship Android smartphone"),
            new Products("OnePlus 10 Pro", "OnePlus", "12GB RAM, 256GB", 60000, 4.5, "Smooth OxygenOS experience"),
            new Products("Realme 9 Pro", "Realme", "8GB RAM, 128GB", 25000, 4.3, "Affordable phone with 5G support"),
            new Products("Xiaomi Redmi Note 11", "Xiaomi", "6GB RAM, 128GB", 18000, 4.2, "Budget-friendly smartphone")
        };
        SubCategories mobilesSub = new SubCategories("Mobiles", mobiles);

        Products[] laptops = {
            new Products("Dell Inspiron", "Dell", "i5, 8GB RAM, 512GB SSD", 55000, 4.5, "Powerful laptop for work and study"),
            new Products("HP Pavilion", "HP", "i7, 16GB RAM, 1TB SSD", 75000, 4.6, "High-performance laptop for professionals"),
            new Products("Apple MacBook Air", "Apple", "M1 Chip, 8GB RAM, 256GB SSD", 90000, 4.8, "Sleek design with excellent battery life"),
            new Products("Lenovo ThinkPad", "Lenovo", "Ryzen 5, 16GB RAM, 512GB SSD", 65000, 4.4, "Durable laptop with business features"),
            new Products("Asus VivoBook", "Asus", "i5, 8GB RAM, 512GB SSD", 58000, 4.3, "Stylish and lightweight laptop")
        };
        SubCategories laptopsSub = new SubCategories("Laptops", laptops);

        Products[] speakers = {
            new Products("JBL Speakers", "JBL", "Wireless", 3500, 4.5, "Portable Bluetooth speaker with waterproof design"),
            new Products("Sony Speaker", "Sony", "Bass Boost", 5500, 4.6, "Crystal clear sound with deep bass"),
            new Products("Boat Speaker", "Boat", "Portable", 2000, 4.2, "Lightweight and easy to carry"),
            new Products("Philips Speaker", "Philips", "Loud", 3200, 4.3, "Rich sound with compact design"),
            new Products("Realme Speaker", "Realme", "Bluetooth", 2800, 4.4, "Stylish design with long battery life")
        };
        SubCategories speakersSub = new SubCategories("Speakers", speakers);

        Products[] headphones = {
            new Products("Sony WH-1000XM4", "Sony", "Wireless, Noise Cancelling", 25000, 4.8, "Industry-leading noise cancellation"),
            new Products("JBL Tune 750BT", "JBL", "Bluetooth, Over-Ear", 8000, 4.5, "Balanced sound with deep bass"),
            new Products("Boat Rockerz 550", "Boat", "Wireless, 20hr Playback", 2000, 4.3, "Comfortable headphones for daily use"),
            new Products("Apple AirPods Pro", "Apple", "Wireless Earbuds", 22000, 4.7, "Premium sound with active noise cancellation"),
            new Products("Sennheiser HD 450BT", "Sennheiser", "Wireless, Foldable", 12000, 4.4, "Great audio with long battery life")
        };
        SubCategories headphonesSub = new SubCategories("Headphones", headphones);
        
        Products[] tablets = {
                new Products("Apple iPad Pro", "Apple", "M2 Chip, 128GB", 80000, 4.9, "High performance tablet"),
                new Products("Samsung Galaxy Tab S8", "Samsung", "8GB RAM, 256GB", 60000, 4.7, "Premium Android tablet"),
                new Products("Lenovo Tab P11", "Lenovo", "6GB RAM, 128GB", 30000, 4.3, "Affordable productivity tablet"),
                new Products("Realme Pad", "Realme", "4GB RAM, 64GB", 18000, 4.2, "Lightweight and stylish tablet"),
                new Products("Amazon Fire HD 10", "Amazon", "32GB, Alexa Built-in", 15000, 4.1, "Best value for media consumption")
            };
            SubCategories tabletsSub = new SubCategories("Tablets", tablets);

        return new Categories("Electronics", new SubCategories[]{mobilesSub, laptopsSub, speakersSub, headphonesSub,tabletsSub});
    }
    
    
//    FurnitureCategory
    

    public static Categories getFurnitureCategory() {
        Products[] sofas = {
            new Products("Recliner Sofa", "Godrej", "3-Seater, Leather", 35000, 4.6, "Luxury comfort recliner"),
            new Products("Wooden Sofa", "Urban Ladder", "Solid Wood, 3-Seater", 25000, 4.5, "Durable and elegant design"),
            new Products("Fabric Sofa", "Ikea", "Soft fabric, 2-Seater", 18000, 4.3, "Compact and stylish"),
            new Products("Corner Sofa", "Pepperfry", "L-shape, Fabric", 30000, 4.4, "Spacious and comfortable"),
            new Products("Convertible Sofa", "Hometown", "Sofa Cum Bed", 28000, 4.2, "Space-saving design")
        };
        SubCategories sofaSub = new SubCategories("Sofas", sofas);

        Products[] beds = {
            new Products("King Size Bed", "Godrej Interio", "Wooden Frame, Storage", 40000, 4.6, "Spacious and durable bed with storage"),
            new Products("Queen Size Bed", "Durian", "Metal Frame, Modern Design", 30000, 4.4, "Compact design with sturdy frame"),
            new Products("Single Bed", "Ikea", "Wooden, No Storage", 15000, 4.2, "Minimalist single bed"),
            new Products("Bunk Bed", "Urban Ladder", "2-Tier, Metal Frame", 22000, 4.3, "Perfect for kids and shared rooms"),
            new Products("Hydraulic Bed", "Hometown", "Storage Bed, King Size", 35000, 4.5, "Convenient hydraulic storage system")
        };
        SubCategories bedsSub = new SubCategories("Beds", beds);

        Products[] tables = {
            new Products("Dining Table", "Ikea", "6-Seater, Wooden", 25000, 4.6, "Elegant dining experience"),
            new Products("Coffee Table", "Urban Ladder", "Glass Top, Wooden Base", 8000, 4.3, "Stylish centerpiece for living room"),
            new Products("Study Table", "Pepperfry", "Compact, Wooden", 6000, 4.2, "Ideal for students and work-from-home"),
            new Products("Office Desk", "Durian", "Modern Design, Storage", 12000, 4.5, "Ergonomic work desk"),
            new Products("Folding Table", "Nilkamal", "Portable, Lightweight", 4000, 4.1, "Easy to carry and store")
        };
        SubCategories tablesSub = new SubCategories("Tables", tables);

        Products[] chairs = {
            new Products("Recliner Chair", "Godrej", "Leather, Adjustable", 15000, 4.7, "Comfortable recliner chair"),
            new Products("Dining Chair", "Urban Ladder", "Wooden, Cushioned", 5000, 4.4, "Elegant dining chair"),
            new Products("Office Chair", "Durian", "Ergonomic, Adjustable Height", 7000, 4.6, "Best for long working hours"),
            new Products("Rocking Chair", "Pepperfry", "Wooden, Traditional", 9000, 4.3, "Classic rocking comfort"),
            new Products("Plastic Chair", "Nilkamal", "Stackable, Lightweight", 1200, 4.0, "Everyday multipurpose chair")
        };
        SubCategories chairsSub = new SubCategories("Chairs", chairs);

        Products[] cupboards = {
            new Products("2-Door Cupboard", "Godrej", "Metal, Lockable", 20000, 4.5, "Durable steel cupboard"),
            new Products("3-Door Wardrobe", "Urban Ladder", "Wooden, With Mirror", 28000, 4.6, "Stylish and functional wardrobe"),
            new Products("Sliding Door Cupboard", "Durian", "Space-saving Design", 25000, 4.4, "Modern sliding cupboard"),
            new Products("Kids Cupboard", "Ikea", "Plastic, Colorful", 8000, 4.2, "Compact storage for kids' room"),
            new Products("Modular Wardrobe", "Hometown", "Customizable, Wooden", 30000, 4.5, "Spacious and stylish design")
        };
        SubCategories cupboardsSub = new SubCategories("Cupboards", cupboards);

        return new Categories("Furniture", new SubCategories[]{sofaSub, bedsSub, tablesSub, chairsSub, cupboardsSub});
    }

//    ClothingCategory
    public static Categories getClothingCategory() {
        Products[] men = {
            new Products("Formal Shirt", "Raymond", "Cotton, Slim Fit", 1200, 4.5, "Perfect for office wear"),
            new Products("Jeans", "Levis", "Slim Fit, Denim", 2500, 4.6, "Durable and stylish"),
            new Products("T-Shirt", "Nike", "Dry-Fit, Sports", 1500, 4.4, "Ideal for workouts"),
            new Products("Blazer", "Peter England", "Wool Blend", 4500, 4.7, "Classic formal look"),
            new Products("Kurta", "FabIndia", "Cotton Ethnic", 2000, 4.3, "Perfect for traditional occasions")
        };
        SubCategories menSub = new SubCategories("Men", men);

        Products[] women = {
            new Products("Saree", "Kalyan Silks", "Silk, Designer", 6000, 4.7, "Elegant traditional wear"),
            new Products("Salwar Suit", "Biba", "Cotton Blend", 3500, 4.5, "Comfortable ethnic set"),
            new Products("Dress", "Zara", "Casual Wear", 4000, 4.6, "Trendy and stylish"),
            new Products("Top", "H&M", "Cotton Casual", 1500, 4.4, "Everyday comfort"),
            new Products("Lehenga", "Manyavar", "Wedding Collection", 12000, 4.8, "Perfect for weddings")
        };
        SubCategories womenSub = new SubCategories("Women", women);

        Products[] children = {
            new Products("School Uniform", "Allen Solly Kids", "Cotton", 2000, 4.5, "Durable and comfy"),
            new Products("Hoodie", "Gap Kids", "Wool Blend", 1800, 4.6, "Stylish winter wear"),
            new Products("Shorts", "Adidas Kids", "Sportswear", 1200, 4.4, "Light and flexible"),
            new Products("Ethnic Wear", "FirstCry", "Festive Set", 2500, 4.3, "Cute and traditional"),
            new Products("Jacket", "Puma Kids", "Sports Jacket", 3000, 4.5, "Warm and trendy")
        };
        SubCategories childrenSub = new SubCategories("Children", children);

        Products[] boys = {
            new Products("T-Shirt", "US Polo", "Cotton Casual", 800, 4.4, "Everyday casual"),
            new Products("Jeans", "Levis Kids", "Denim", 1500, 4.5, "Trendy and durable"),
            new Products("Shirt", "Allen Solly", "Casual Wear", 1200, 4.3, "Comfortable and stylish"),
            new Products("Sweater", "H&M Kids", "Wool", 2000, 4.6, "Perfect for winter"),
            new Products("Kurta Set", "FabIndia Kids", "Ethnic Wear", 2500, 4.5, "Traditional look")
        };
        SubCategories boysSub = new SubCategories("Boys", boys);

        Products[] girls = {
            new Products("Frock", "Mothercare", "Cotton Casual", 1200, 4.5, "Light and pretty"),
            new Products("Skirt", "Zara Kids", "Denim", 1800, 4.6, "Trendy design"),
            new Products("Lehenga", "Biba Kids", "Festive Wear", 4000, 4.7, "Perfect for functions"),
            new Products("Leggings", "H&M Kids", "Cotton Stretch", 1000, 4.4, "Comfortable everyday wear"),
            new Products("Jacket", "Puma Kids", "Winter Wear", 2500, 4.5, "Warm and stylish")
        };
        SubCategories girlsSub = new SubCategories("Girls", girls);

        return new Categories("Clothing", new SubCategories[]{menSub, womenSub, childrenSub, boysSub, girlsSub});
    }
    
//    GroceriesCategory

    public static Categories getGroceriesCategory() {
        Products[] rice = {
            new Products("Basmati Rice", "India Gate", "5kg Pack", 600, 4.6, "Long grain aromatic rice"),
            new Products("Sona Masoori Rice", "Fortune", "10kg Pack", 850, 4.5, "Light and aromatic rice"),
            new Products("Brown Rice", "Daawat", "5kg Pack", 700, 4.3, "Healthy whole grain rice"),
            new Products("Kolam Rice", "India Gate", "5kg Pack", 500, 4.2, "Budget friendly rice"),
            new Products("Steam Rice", "Tata Sampann", "10kg Pack", 900, 4.4, "Everyday use rice")
        };
        SubCategories riceSub = new SubCategories("Rice", rice);

        Products[] pulses = {
            new Products("Toor Dal", "Fortune", "1kg Pack", 200, 4.5, "High quality pigeon peas"),
            new Products("Moong Dal", "Tata Sampann", "1kg Pack", 220, 4.4, "Healthy green gram dal"),
            new Products("Chana Dal", "Aashirvaad", "1kg Pack", 210, 4.3, "Good quality chickpea dal"),
            new Products("Masoor Dal", "Fortune", "1kg Pack", 180, 4.2, "Red lentils, easy to cook"),
            new Products("Urad Dal", "Tata Sampann", "1kg Pack", 230, 4.5, "High protein black gram")
        };
        SubCategories pulsesSub = new SubCategories("Pulses", pulses);

        Products[] vegetables = {
            new Products("Tomato", "Local Farm", "1kg Pack", 40, 4.2, "Fresh red tomatoes"),
            new Products("Potato", "Fresh Veggies", "1kg Pack", 30, 4.1, "Healthy and organic potatoes"),
            new Products("Onion", "Farm Fresh", "1kg Pack", 50, 4.3, "Red onions for daily use"),
            new Products("Carrot", "Local Farm", "500gm Pack", 60, 4.4, "Crunchy fresh carrots"),
            new Products("Capsicum", "Fresh Veggies", "500gm Pack", 70, 4.3, "Green bell peppers")
        };
        SubCategories vegetablesSub = new SubCategories("Vegetables", vegetables);

        Products[] fruits = {
            new Products("Apple", "Himachal Farms", "1kg Pack", 250, 4.6, "Fresh and juicy apples"),
            new Products("Banana", "Tropical Farms", "1 Dozen", 60, 4.5, "Sweet and ripe bananas"),
            new Products("Mango", "Alphonso Farms", "1kg Pack", 400, 4.8, "Seasonal king of fruits"),
            new Products("Orange", "Nagpur Farms", "1kg Pack", 120, 4.4, "Juicy and tangy oranges"),
            new Products("Pomegranate", "Local Farms", "1kg Pack", 200, 4.5, "Sweet and healthy pomegranate")
        };
        SubCategories fruitsSub = new SubCategories("Fruits", fruits);

        Products[] beverages = {
            new Products("Tea", "Tata Tea", "500gm Pack", 250, 4.5, "Premium quality tea leaves"),
            new Products("Coffee", "Nescafe", "200gm Pack", 300, 4.6, "Instant coffee granules"),
            new Products("Fruit Juice", "Real", "1L Pack", 120, 4.3, "Fresh fruit juice"),
            new Products("Milk", "Amul", "1L Pack", 60, 4.4, "Pure cow milk"),
            new Products("Soft Drink", "Coca Cola", "1.5L Bottle", 100, 4.2, "Refreshing carbonated drink")
        };
        SubCategories beveragesSub = new SubCategories("Beverages", beverages);

        return new Categories("Groceries", new SubCategories[]{riceSub, pulsesSub, vegetablesSub, fruitsSub, beveragesSub});
    }
}
