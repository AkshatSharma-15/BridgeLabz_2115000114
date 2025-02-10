abstract class Product {
    private int id;
    private String productName;
    private double productCost;

    public Product(String productName, int id, double productCost) {
        this.productName = productName;
        this.id = id;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    abstract double calculateDiscount();

    abstract double calculateTax();

    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Product ID : " + id);
        System.out.println("Product Cost : " + productCost);
    }

    public void displayFinalPrice() {
        double finalCost = getProductCost() + calculateTax() - calculateDiscount();
        System.out.println("Final Price (after discount and tax) : " + finalCost);
    }
}

interface Taxable {

    double calculateTax();

    void showTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountPercentage;

    public Electronics(String productName, int id, double productCost, double discountPercentage) {
        super(productName, id, productCost);
        this.discountPercentage = discountPercentage;
    }

    // Implementing the abstract method for discount
    public double calculateDiscount() {
        return (getProductCost() * discountPercentage) / 100;
    }

    // Implementing the abstract method for tax calculation
    public double calculateTax() {
        return (getProductCost() * 18) / 100;  
    }

    // Implementing the interface method to display tax details
    public void showTaxDetails() {
        System.out.println("Tax on " + getProductName() + " : " + calculateTax());
    }

    // Overriding the method to display final price after discount and tax
    public void displayProductDetails() {
        super.displayProductDetails();
        displayFinalPrice();
    }
}

class Clothing extends Product implements Taxable {
    private double discountPercentage;

    // Constructor to initialize clothing product details
    public Clothing(String productName, int id, double productCost, double discountPercentage) {
        super(productName, id, productCost);
        this.discountPercentage = discountPercentage;
    }

    // Implementing the abstract method for discount
    @Override
    public double calculateDiscount() {
        return (getProductCost() * discountPercentage) / 100;
    }

    // Implementing the abstract method for tax calculation
    @Override
    public double calculateTax() {
        return (getProductCost() * 12) / 100;  
    }

    // Implementing the interface method to display tax details
    @Override
    public void showTaxDetails() {
        System.out.println("Tax on " + getProductName() + " : " + calculateTax());
    }

    // Overriding the method to display final price after discount and tax
    public void displayProductDetails() {
        super.displayProductDetails();
        displayFinalPrice();
    }
}

class Groceries extends Product implements Taxable {
    private double discountPercentage;

    // Constructor to initialize grocery product details
    public Groceries(String productName, int id, double productCost, double discountPercentage) {
        super(productName, id, productCost);
        this.discountPercentage = discountPercentage;
    }

    // Implementing the abstract method for discount
    public double calculateDiscount() {
        return (getProductCost() * discountPercentage) / 100;
    }

    // Implementing the abstract method for tax calculation
    public double calculateTax() {
        return (getProductCost() * 5) / 100;  // Fixed 5% tax for groceries
    }

    // Implementing the interface method to display tax details
    public void showTaxDetails() {
        System.out.println("Tax on " + getProductName() + " : " + calculateTax());
    }

    // Overriding the method to display final price after discount and tax
    public void displayProductDetails() {
        super.displayProductDetails();
        displayFinalPrice();
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // Creating instances of product categories
        Product electronicItem = new Electronics("iPhone", 101, 99999, 18);
        Product clothingItem = new Clothing("Sweat Shirt", 145, 799, 12);
        Product groceryItem = new Groceries("Ketchup", 121, 99, 4);

        // Displaying product details along with taxes and discounts
        electronicItem.displayProductDetails();
        clothingItem.displayProductDetails();
        groceryItem.displayProductDetails();
 
    }
}