
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give Speed:");
        int num = Integer.valueOf(scan.nextLine());
        if (num>120){
            System.out.println("Speeding ticket!");
        }
    }
}
