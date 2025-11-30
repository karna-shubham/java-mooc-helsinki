
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface UI = new UserInterface ();
        Stats stat = new Stats ();
        UI.start();
        ArrayList<Float> list = UI.get();
        System.out.println(stat.pointsAverage(list));
        System.out.println(stat.passingAverage(list));
        System.out.println(stat.passingPercentage(list));
        stat.gradeDistribution(list);        
    }
}
