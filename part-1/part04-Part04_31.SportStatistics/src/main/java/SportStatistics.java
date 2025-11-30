
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Name:");
        String team = scan.nextLine();
        
        int cntGame = 0, cntWin = 0, cntLoss = 0;
        
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                if(parts[0].equals(team)){
                    cntGame++;
                    if (Integer.valueOf(parts[2])>Integer.valueOf(parts[3])){
                        cntWin++;
                    }else{
                        cntLoss++;
                    }
                }
                if(parts[1].equals(team)){
                    cntGame++;
                    if (Integer.valueOf(parts[2])>Integer.valueOf(parts[3])){
                        cntLoss++;
                    }else{
                        cntWin++;
                    }
                    
                }
                
            }
        }catch (Exception e){
             System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println("Games: "+cntGame);
        System.out.println("Wins: "+cntWin);
        System.out.println("Losses: "+cntLoss);

    }

}
