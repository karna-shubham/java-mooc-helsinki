import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Enter the program name; Empty ends it");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }else{
                System.out.println("Enter the duration of the program");
                int dur = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(name,dur));
                
            }
            
        }
        
        System.out.println("Enter the maximum duration for a program");
        int maxDur = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram i : programs){
            if (i.getDuration()<=maxDur){
                System.out.println(i);
            }
        }

    }
}
