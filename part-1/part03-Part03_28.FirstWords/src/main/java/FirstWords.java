
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String txt = scanner.nextLine();
            if (txt.equals("")){
                break;
            }
            String[] splitResult = txt.split(" ");
            System.out.println(splitResult[0]);
        }

    }
}
