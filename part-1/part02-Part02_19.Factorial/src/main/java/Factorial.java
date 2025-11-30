
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        while (num!=0){
            fact = fact*num;
            num-=1;
           
        }
        System.out.println("Factorial: "+fact);

    }
}
