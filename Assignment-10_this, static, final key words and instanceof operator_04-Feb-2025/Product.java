class Product {
    private static double discount = 10.0;
    private String productName;
    private final int productID;
    private double price;
    private int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Shopping_Cart Name: " + productName);
            System.out.println("Shopping_Cart ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 234, 40000.0, 1);
        Product prod2 = new Product("Mobile Phone", 343, 65000.0, 2);

        prod1.displayProductDetails();
        System.out.println();
        prod2.displayProductDetails();

        updateDiscount(15.0);
        System.out.println("\nUpdated Discount: " + discount + "%");
    }
}