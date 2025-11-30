import java.util.Scanner;
public class InAHoleInTheGround {

    public static void main(String[] args) {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i<=num; i++){
            printText();
        }
    }
    
    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
        
    }
}
