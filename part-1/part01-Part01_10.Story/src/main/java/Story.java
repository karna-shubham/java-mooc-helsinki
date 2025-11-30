
import java.util.Scanner;
public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String msg = scanner.nextLine();
        System.out.println("What is their job?");
        String msg2 = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was " + msg + ", who was " + msg2+ ".\nOn the way to work, " + msg + " reflected on life.\nPerhaps "+msg+ " will not be "+msg2+" forever.");
    }
}
