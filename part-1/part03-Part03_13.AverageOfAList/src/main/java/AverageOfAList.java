
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <>();

        //reading input from user and creating the list
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num==-1){
                break;
            }
            list.add(num);
        }
        
        //adding all the elements of the list
        int sum=0;
        for(int i : list){
            sum+=i;
        }
        
        //finding and printing the average
        System.out.println("Average: "+((1.0*sum)/list.size()));
        
        
    }
}
