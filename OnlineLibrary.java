import java.util.ArrayList;
import java.util.Scanner;

public class OnlineLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Online Library: ");
        System.out.println("---------------------------------");
        System.out.println("1. Show books");
        System.out.println("2. Add books");
        System.out.println("3. Return book");
        System.out.println("4. Get book");
        System.out.println("----------------------------------");
        System.out.println();
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> library.show_books();
            case 2 -> library.add_book();
            case 3 -> library.return_book();
            case 4 -> library.issue_book();
            default -> {
                System.out.println("Invalid Selection!");
                main(null);
            }
        }
    }
}

class library{
    static ArrayList<String> books = new ArrayList<>();
    static {  // this is known as static initializer
        books.add("demo1");
        books.add("demo2");
        books.add("demo3");
        books.add("demo4");
        books.add("demo5");
    }
    static Scanner input =  new Scanner(System.in);
    static void add_book(){
        System.out.println("Enter the no. of books you want to add: ");
        int no_of_books = input.nextInt();

        for (int i = 0; i < no_of_books ; i++) {
            System.out.print("Book no " + i + ": ");
            books.add(input.next());
            if (i == no_of_books-1){
                System.out.println("Books added successfully!");
            }
        }
    }

    static void issue_book(){
        System.out.println("Enter the book you want to issue: ");
        String book = input.next();

        for (String s : books) {
            if (book.equals(s)) {
                System.out.println("Books issued Successfully.");
                System.out.println("Book Name : " + book);
            } else System.out.println("Book not found!");
        }
    }
    static void return_book(){
        System.out.println("Enter the name of the book you want to return: ");
        String returned_book = input.next();
         for (String book :
                books) {
            if (returned_book.equals(book)) {
                System.out.println("Book returned successfully!");
            } else System.out.println("Book not found!");
        }
    }

    static void show_books(){
        for (String s :
                books) {
            System.out.println(s);
        }
    }
}
