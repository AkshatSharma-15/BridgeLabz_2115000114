// Abstract class to represent a Library Item
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;  
    }

    public int getLoanDuration() {
        return 14;  
    }

    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The book \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The book \"" + getTitle() + "\" is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public int getLoanDuration() {
        return 7;  
    }

    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The magazine \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public int getLoanDuration() {
        return 5;  
    }

    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The DVD \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The DVD \"" + getTitle() + "\" is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of library items
        LibraryItem book = new Book(3, "Java Programming", "ABC");
        LibraryItem magazine = new Magazine(1, "Tech Yearly", "XYZ");
        LibraryItem dvd = new DVD(2, "Inception", "Christopher Nolan");

        LibraryItem[] items = { book, magazine, dvd };
        
        // Display item details and loan duration
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }

        // Reserve items and check availability
        ((Reservable) book).reserveItem();
        System.out.println("Is Book available: " + ((Reservable) book).checkAvailability());
        
        ((Reservable) magazine).reserveItem();
        System.out.println("Is Magazine available: " + ((Reservable) magazine).checkAvailability());

        ((Reservable) dvd).reserveItem();
        System.out.println("Is DVD available: " + ((Reservable) dvd).checkAvailability());
    }
}