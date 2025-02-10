// Abstract class representing a food item
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate the total price of the food item
    public abstract double calculateTotalPrice();

    // Concrete method to display food item details
    public void getItemDetails() {
        System.out.println("Food Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Interface for discountable items
interface Discountable {
    void applyDiscount(double discountPercentage);
    void getDiscountDetails();
}

// VegItem class inheriting from FoodItem and implementing Discountable interface
class VegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0;  // Default discount is 0%
    }

    public double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity();
        return totalPrice;
    }

    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        totalPrice = calculateTotalPrice() - (calculateTotalPrice() * discountPercentage / 100);
    }

    public void getDiscountDetails() {
        System.out.println("Veg Item Discount: " + discountPercentage + "%");
        System.out.println("Total Price after Discount: " + totalPrice);
    }

    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discountPercentage;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0;  // Default discount is 0%
    }

    public double calculateTotalPrice() {
        totalPrice = getPrice() * getQuantity() + 20;  // Additional charge for non-veg items
        return totalPrice;
    }

    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        totalPrice = calculateTotalPrice() - (calculateTotalPrice() * discountPercentage / 100);
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount: " + discountPercentage + "%");
        System.out.println("Total Price after Discount: " + totalPrice);
    }

    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create instances of food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Tikka", 200, 3);

        FoodItem[] orderItems = { vegItem, nonVegItem };

        // Process order items
        for (FoodItem item : orderItems) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10);  
                discountableItem.getDiscountDetails();
            }
            System.out.println();  
        }
    }
}