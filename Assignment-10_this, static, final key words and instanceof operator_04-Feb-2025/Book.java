public class Book {
    private static String libraryName = "GLA Library";
    private final String isbn;
    
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    public void displayBookDetails() {
        if (this instanceof Book) {  
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    
    public static void main(String[] args) {
        // Create two book objects
        Book book1 = new Book("ABC", "Hellen", "12345678");
        Book book2 = new Book("abc", "Gippy", "1324585649");
        
        // Display library name using static method
        Book.displayLibraryName();
        
        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
