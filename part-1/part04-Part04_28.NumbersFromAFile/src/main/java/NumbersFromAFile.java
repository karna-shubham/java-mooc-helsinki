
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //variable initialization
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int cntNum = 0;
        
        //read the file
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                int num = Integer.valueOf(row);
                if(num>=lowerBound && num<=upperBound){
                    cntNum=cntNum+1;
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Numbers: "+cntNum);
    }

}
