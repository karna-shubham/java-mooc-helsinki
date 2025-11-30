
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String name = "";
        while (true){
            String txt = scanner.nextLine();
            if(txt.equals("")){
                break;
            }
            
            String[] splitResult = txt.split(",");
            if((Integer.valueOf(splitResult[1]))>old){
                old = Integer.valueOf(splitResult[1]);
                name = splitResult[0];
            }
            
        }
        
        System.out.println("Name of the oldest: "+name);

        

    }
}
