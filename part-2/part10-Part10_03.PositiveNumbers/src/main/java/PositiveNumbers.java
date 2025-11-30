
import java.util.List;
import java.util.Scanner;
import java.util.Collection;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> nums = numbers.stream()
                .filter(val -> val > 0)
                .collect(Collectors.toList());
        
        return nums;
    }

}
