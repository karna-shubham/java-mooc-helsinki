
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String txt = scanner.nextLine();
            if (txt.equals("end")){
                break;
            }
            int cube = Integer.valueOf(txt)*Integer.valueOf(txt)*Integer.valueOf(txt);
            System.out.println(cube);
        }

    }
}
