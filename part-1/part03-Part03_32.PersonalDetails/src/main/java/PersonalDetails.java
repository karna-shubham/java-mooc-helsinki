
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        //initialization
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int cnt=0, sum=0, avg=0;
        
        //reading input from user
        while(true){
            String txt = scanner.nextLine();
            if (txt.equals("")){
                break;
            }
            //working on user input
            String[] splitResult = txt.split(",");
            sum = sum + Integer.valueOf(splitResult[1]);
            cnt+=1;
            if((name.length())<(splitResult[0].length())){
                name = splitResult[0];
            }
        }
        
        System.out.println("Longest Name: "+name);
        System.out.println("Average of birth years: "+((1.0*sum)/cnt));

    }
}
