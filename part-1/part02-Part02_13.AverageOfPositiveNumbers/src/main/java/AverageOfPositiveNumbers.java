
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0){
                cnt = cnt+1;
                sum = sum+num;
                     
            }else if(num==0){
                break;
            }
        }
        if (cnt==0){
            System.out.println("Cannot calculate average");
        }else{
            System.out.println(1.0*sum/cnt);
        }

    }
}
