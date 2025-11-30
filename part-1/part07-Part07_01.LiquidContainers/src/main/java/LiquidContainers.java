
import java.util.Scanner;
import java.util.ArrayList;
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        String[] command;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            command = input.split(" ");
            String cmd = command[0];
            int val = Integer.valueOf(command[1]);
            if (cmd.equals("add")){
                if (val < 0) break;                
                first = first + val;
                if (first > 100) first = 100;
            }else if (cmd.equals("move")){
                
                if (val>first){
                    second = second + first;
                    first = 0;                    
                }else{
                    first = first - val;
                    second = second + val;
                }
                if (second > 100) second = 100;
            }else if (cmd.equals("remove")){
                if (val>second) {
                    second = 0;
                }else{
                    second = second - val;
                }
            }else{
                System.out.println("Wrong command");
            }
            
            
        }
            
            
    }

}
