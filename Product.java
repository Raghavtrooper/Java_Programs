class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    private static int totalProducts = 0;

    public Product() {
        productId = 0;
        productName = "Default Product";
        category = "General";
        price = 0.0;
        totalProducts++;
    }

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++; 
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) {
        double discountedPrice = price - (price * discountRate / 100);
        return discountedPrice * quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(101, "Laptop", "Electronics", 1200.50);
        Product product3 = new Product(102, "Smartphone", "Electronics", 800.75);

        Product.displayTotalProducts();

        System.out.println();

        System.out.println("Product 1 Details:");
        product1.displayProductInfo();
        System.out.println("Stock Value for 10 units: $" + product1.calculateStockValue(10));
        System.out.println("Stock Value for 10 units with 10% discount: $" + product1.calculateStockValue(10, 10));

        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductInfo();
        System.out.println("Stock Value for 5 units: $" + product2.calculateStockValue(5));
        System.out.println("Stock Value for 5 units with 15% discount: $" + product2.calculateStockValue(5, 15));

        System.out.println();

        System.out.println("Product 3 Details:");
        product3.displayProductInfo();
        System.out.println("Stock Value for 8 units: $" + product3.calculateStockValue(8));
        System.out.println("Stock Value for 8 units with 20% discount: $" + product3.calculateStockValue(8, 20));
    }
}
