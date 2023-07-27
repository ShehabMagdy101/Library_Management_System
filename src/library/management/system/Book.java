
package library.management.system;



 
public class Book extends javax.swing.JFrame{
    private String name;
    private String ISBN;
    private String Author;
    private String publisher;
    private String publishing_Year;
    private int price;
    private int NumberOfPages;
    private Boolean available;

     public Book(){
     
     }
     
    public Book(String name, String author, String publisher,String publishing_Year,int price ,int NumberOfPages,String ISBN) {
        this.name = name;
        this.Author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.available = true;
        this.publishing_Year=publishing_Year;
        this.NumberOfPages=NumberOfPages;
        this.price=price;
    }

    // getters and setters

     
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishing_Year() {
        return publishing_Year;
    }

    public void setPublishing_Year(String publishing_Year) {
        this.publishing_Year = publishing_Year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
  

    // borrow and return methods
    public void borrowBook() {
        if (this.available) {
            this.available = false;
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    public void returnBook() {
        this.available = true;
    }
 
}
    
    
