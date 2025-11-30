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
import java.util.ArrayList;
public class UserInterface {
    private TodoList toDo;
    private Scanner scan;
    
    public UserInterface (TodoList toDo, Scanner scan){
        this.toDo = toDo;
        this.scan = scan;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String userInput = scan.nextLine().toLowerCase();
            if (userInput.equals("stop")){
                break;
            }else if (userInput.equals("add")){
                System.out.println("To add: ");
                String word = scan.nextLine();
                toDo.add(word);
            
            }else if (userInput.equals("list")){
                toDo.print();
            }else if (userInput.equals("remove")){
                System.out.println("Which one is removed?");
                int num = scan.nextInt();
                toDo.remove(num);
            }
        }
    }
}
