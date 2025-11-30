
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String txt = scanner.nextLine();
            if(txt.equals("")){
                break;
            }
            
            String[] splitResult = txt.split(" ");
            for(String i : splitResult){
                String[] splitResult2 = i.split("av");
                if(splitResult2.length>1){
                    System.out.println(i);
                }
            }
            
        }

    }
}
