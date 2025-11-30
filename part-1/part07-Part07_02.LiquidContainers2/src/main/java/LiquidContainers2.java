
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        String[] command;


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            command = input.split(" ");
            String cmd = command[0];
            int val = Integer.valueOf(command[1]);
            if (cmd.equals("add")){
                first.add(val);
            }else if (cmd.equals("move")) {
                if (val>first.contains()){
                    second.add(first.contains());
                    first.remove(first.contains());
                    
                }else{
                    first.remove(val);
                    second.add(val);
                }
                 
                
            }else if (cmd.equals("remove")){
                second.remove(val);
            }            
            
        }
    }

}
