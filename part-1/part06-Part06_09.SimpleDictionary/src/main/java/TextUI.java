/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.Scanner;
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;
    
    public TextUI (Scanner scan, SimpleDictionary dict){
        this.scan = scan;
        this.dict = dict;
    }
    
    public void start(){
        
        while (true){
            System.out.println("Command: ");
            String userInput = scan.nextLine().toLowerCase();
            if (userInput.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if (userInput.equals("add")){
                System.out.println("Word: ");
                String word = scan.nextLine();
                System.out.println("Translation: ");
                String translate = scan.nextLine();
                dict.add(word, translate);
            
            }else if (userInput.equals("search")){
                System.out.println("To be translated: ");
                String userInput2 = scan.nextLine().toLowerCase();
                String translate = dict.translate(userInput2);
                if (translate == null){
                    System.out.println("Word " + userInput2 + " was not found");
                }else{
                    System.out.println("Translation: " + translate);
                }                
            }else{
                System.out.println("Unknown command");
            }
        }
    }
    
    
}
