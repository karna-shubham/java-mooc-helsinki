
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (true){
            String txt = scanner.nextLine();
            if(txt.equals("end")){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
