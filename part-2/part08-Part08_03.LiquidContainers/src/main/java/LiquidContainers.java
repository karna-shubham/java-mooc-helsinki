
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: "+ second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String [] parts = input.split(" ");
            String cmd = parts[0];
            int amt = Integer.valueOf(parts[1]);
            if (cmd.equals("add")){
                if (amt >= 0) first = first + amt;
                if (first > 100) first = 100;
            }else if (cmd.equals("remove")){
                if (amt > second ) second = 0;
                second = second - amt;
                if (second < 0) second = 0;
            }else{
                if (amt >= first){
                    second = second + first;
                    first = 0;
                }else{
                    second = second + amt;
                    first = first - amt;
                }
                if (second>100) second = 100;
            }

        }
    }

}
