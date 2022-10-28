import java.util.ArrayList;
import java.util.Scanner;

public class OnlineLibrary {
    public static void main(String[] args) {
        library l1 = new library();
        library.add_book();
//        System.out.println(library.books);
        library.issue_book();
        library.return_book();

    }
    

}

class library{

    static ArrayList<String> books = new ArrayList<>();
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
        System.out.println(books);
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
         for (String i :
                books) {
            if (returned_book.equals(i)) {
                System.out.println("Book returned successfully!");
            }
        }
    }
}
