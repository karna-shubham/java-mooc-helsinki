
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName = "literacy.csv";
//        ArrayList<String> lines = new ArrayList<>();
        ArrayList<LiteracyRecord> list = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(fileName))
                    .map(line -> line.split(","))
                    .map(parts -> new LiteracyRecord(
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].replace("(%)","").trim(),
                            parts[3].trim(),
                            Integer.valueOf(parts[4].trim()),
                            Double.valueOf(parts[5].trim())
                    ))
                    .forEach(list::add);
                    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        Collections.sort(list);
        for (LiteracyRecord rec : list) {
            System.out.println(rec);
        }

    }
}
