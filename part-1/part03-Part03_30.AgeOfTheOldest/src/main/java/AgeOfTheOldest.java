
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        while (true){
            String txt = scanner.nextLine();
            if(txt.equals("")){
                break;
            }
            
            String[] splitResult = txt.split(",");
            if((Integer.valueOf(splitResult[1])>old)){
                old = Integer.valueOf(splitResult[1]);
            }
        }
        
        System.out.println("Age of the oldest: "+old);


    }
}
