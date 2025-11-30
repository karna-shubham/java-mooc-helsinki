
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num==0){
                break;
            }else{
                sum=sum+num;
                cnt=cnt+1;
            }
        }
        double avg = (double) sum / cnt;
        System.out.println("Average of the numbers: "+(avg));

    }
}
