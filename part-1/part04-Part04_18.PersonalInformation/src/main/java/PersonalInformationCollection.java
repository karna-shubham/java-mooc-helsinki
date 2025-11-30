
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Enter the first name, Empty ends it");
            String fName = scanner.nextLine();
            if (fName.equals("")){
                break;
            }else{
                System.out.println("Enter the last name");
                String lName = scanner.nextLine();
                System.out.println("Enter the Identification number of" + fName + lName);
                String id = scanner.nextLine();
                infoCollection.add(new PersonalInformation(fName,lName,id));
            }
        }
        
        for (PersonalInformation i : infoCollection){
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
        

    }
}
