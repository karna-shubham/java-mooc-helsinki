import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    /*public ArrayList<String> readRecordsFromFile(String file){
        ArrayList<String> fname = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                fname.add(parts[0]);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return fname;
    }*/

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }

}
