
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String txt = scanner.nextLine();
            if (txt.equals("")){
                break;
            }
            String[] splitResult = txt.split(" ");
            System.out.println(splitResult[(splitResult.length)-1]);
        }


    }
}
