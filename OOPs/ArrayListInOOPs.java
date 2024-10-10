//A library needs a system to keep track of the available books. Each book has attributes like title, author, and availability. When new books are added or borrowed, the list should dynamically adjust.

import java.util.ArrayList;

class Book {
    int a;
    String title;
    String author;
    Boolean isAvailable;

    public Book(String title, String author, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(title)) {
                books.remove(i);
                System.out.println("Removed book: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void listOfAvailableBooks() {
        System.out.println("\t**********************Available Books:***********************");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println("\tTitle: " + book.title + ", \tAuthor: " + book.author);
            }
        }
    }
    
}

public class ArrayListInOOPs {
    public static void main(String[] args) {
        Library l = new Library();
        Book b1 = new Book("Physics", "Dhami", true);
        Book b2 = new Book("Math", "Rahul", true);
        Book b3 = new Book("Chemistry", "Rohan", true);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);

        l.listOfAvailableBooks();
        l.removeBook("Physics");
        l.listOfAvailableBooks();
        l.removeBook("CS");
        
    }
    
}
