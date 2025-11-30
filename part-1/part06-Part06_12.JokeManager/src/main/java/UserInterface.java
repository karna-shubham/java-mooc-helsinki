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
    private JokeManager JK1;
    private Scanner scan;
    
    public UserInterface(JokeManager JK1, Scanner scan){
        this.JK1 = JK1;
        this.scan = scan;
    }
    
    public void start(){
        while(true){
            
            System.out.println("Commands:\n" +
                                "1 - add a joke\n" +
                                "2 - draw a joke\n" +
                                "3 - list jokes\n" +
                                "X - stop");
            String userInput = scan.nextLine();
            if (userInput.equals("X")) break;
            if (userInput.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                this.JK1.addJoke(joke);
            }else if (userInput.equals("2")){
                System.out.println("Drawing a joke:");
                System.out.println(this.JK1.drawJoke());
            }else if (userInput.equals("3")){
                System.out.println("Printing the jokes.");
                this.JK1.printJokes();
            }
        }
    }
    
}
