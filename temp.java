import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        jff j = new jff();
        j.addbook();
        j.issuebook();
    }
}


class jff{
    Scanner scanner = new Scanner(System.in);
    String[] books = new String[2];
    void issuebook() {
        System.out.println("Enter the name of the book you want to issue?");
        String issue_book_name = scanner.next();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == issue_book_name) {
                System.out.println("Book issued -> " + issue_book_name);
            } else
                System.out.println("Book not found");
        }
    }
    void addbook() {
        // add book to the array
        // System.out.println("Enter the number of the books you want to be added?");
        // int number_of_books = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the name of the books you want to be added?");
            String book_name = scanner.next();
            books[i] = book_name;
        }
    }
}