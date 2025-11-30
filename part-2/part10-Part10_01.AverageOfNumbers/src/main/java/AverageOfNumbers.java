
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            nums.add(row);
        }
        
        double average = nums.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average().getAsDouble();
        System.out.println(average);

    }
}
