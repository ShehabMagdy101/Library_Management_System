
package library.management.system;

import java.util.ArrayList;


public class Book4 extends Book {
      private ArrayList<Book> books;
      
    public Book4(){
    books = new ArrayList<>();
    }
      public void addBook(Book book) {
        books.add(book);
    }

       public void removeBook(Book book) {
        books.remove(book);
    }
       public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
       }
   static String Name="ahemd";
  static  String ISBN;
  static   String Author;
    static String publisher;
      static String publishing_Year;
    static int price;
      static int NumberOfPages;
   
    
       
      
        static Book newBook=new Book( Name, Author,publisher, publishing_Year,price, NumberOfPages,ISBN);
        public static void main(String[] args) {
          Book4 b4=new Book4();
          b4.addBook(newBook);
    }

}


