import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Enter the title of the book, empty ends it");
            String bookName = scanner.nextLine();
            if (bookName.equals("")){
                break;
            }else{
                System.out.println("Enter the number of pages in the book");
                int bookPages = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter the publication year of the book");
                int bookYear = Integer.valueOf(scanner.nextLine());   
                books.add(new Book(bookName, bookPages, bookYear));
            }
        }
        
        System.out.println("How do you wanna print? Everything or Names?");
        String temp = scanner.nextLine();
        if (temp.equals("everything")){
            for (Book i : books){
                System.out.println(i.everything());
            }
        }else if (temp.equals("name")){
            for (Book i : books){
                System.out.println(i.names());
            }
        }else{
            System.out.println("wrong input.");
        }
        
        

    }
}
