
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("How many random numbers should be printed?");
        int times = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= times; i++){
            System.out.println(r.nextInt(11));
        }
    }

}
