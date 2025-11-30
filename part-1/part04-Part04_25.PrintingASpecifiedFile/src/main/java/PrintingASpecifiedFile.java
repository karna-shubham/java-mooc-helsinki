
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        
        try(Scanner fscanner = new Scanner(Paths.get(fName))){
            while(fscanner.hasNextLine()){
                String row = fscanner.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
