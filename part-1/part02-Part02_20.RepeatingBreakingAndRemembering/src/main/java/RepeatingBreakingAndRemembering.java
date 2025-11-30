
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
              
        Scanner scanner = new Scanner(System.in);
        int sum = 0, cntNum = 0, avg = 0, cntOdd = 0, cntEven=0;
        System.out.println("Give numbers:");
        int i = Integer.valueOf(scanner.nextLine());
        while(i!=-1){
            cntNum++;
            sum+=i;
            if (i%2==0){
                cntEven++;
            }else{
                cntOdd++;
            }
            i = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+cntNum);
        System.out.println("Average: "+(1.0*sum/cntNum));
        System.out.println("Even: "+cntEven);
        System.out.println("Odd: "+cntOdd);

    }
}
