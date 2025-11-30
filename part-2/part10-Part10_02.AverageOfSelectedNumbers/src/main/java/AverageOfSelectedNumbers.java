
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> nums = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            nums.add(row);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.equals("p")){
            double average = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average().getAsDouble();
            System.out.println("Average of positive numbers: " + average);
        }else{
            double average = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average().getAsDouble();
            System.out.println("Average of negative numbers: " + average);
        }
        

    }
}
