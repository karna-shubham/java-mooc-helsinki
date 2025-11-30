
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean flag = false;
        
        try (Scanner fscanner = new Scanner(Paths.get(file))){
            while(fscanner.hasNextLine()){
                String row = fscanner.nextLine();
                if (row.equals(searchedFor)){
                    System.out.println("Found!");
                    flag = true;
                    break;
                }
            }
            
            if (flag == false){
                System.out.println("Not found.");
            }
        }catch(Exception e){
            System.out.println("Reading the file "+file+" failed.");
        }

    }
}
