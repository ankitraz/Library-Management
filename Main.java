import java.util.Scanner;

class library {
    Scanner scanner = new Scanner(System.in);
    // create an array of string in java
    String[] books = { "ram", "shyam", "hari" };
    ArrayList<Integer> List  =  new Arraylist

    /*
     * void addbook() {
     * // add book to the array
     * // System.out.println("Enter the number of the books you want to be added?");
     * // int number_of_books = scanner.nextInt();
     * for (int i = 0; i < books.length; i++) {
     * System.out.println("Enter the name of the books you want to be added?");
     * String book_name = scanner.next();
     * books[i] = book_name;
     * }
     * }
     */

    void issuebook() {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the name of the book you want to issue?");
        System.out.println("----------------------------------------------------");
        String issue_book_name = scanner.next();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(issue_book_name)) {
                System.out.println("Book issued -> " + issue_book_name);
                
            } else{
                System.out.println("Book not found");
            }
            
        }
    }

    void returnbook() {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the name of the book you want to return?");
        System.out.println("----------------------------------------------------");
        String return_book_name = scanner.next();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(return_book_name)) {
                System.out.println("Book matched and returned sucessfully -> " + return_book_name);
                
            }
            else{
                System.out.println("Book not found");
                
            }
        }
    }

    void showbooks() {
        System.out.println("----------------------------------------------------");
        System.out.println("These are the books available in the library");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book name -> " + books[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        library l1 = new library();
        // l1.addbook();
        l1.showbooks();
        l1.issuebook();
        l1.returnbook();
    }
}