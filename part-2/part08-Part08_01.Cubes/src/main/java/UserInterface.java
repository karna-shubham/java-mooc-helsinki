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
public class UserInterface {
    private Scanner scan;
    
    public UserInterface(){
        this.scan = new Scanner (System.in);
    }
    
    public void start(){
        while (true){
            String userInput = scan.nextLine().toLowerCase();
            if (userInput.equals("end")) break;
            int num = Integer.valueOf(userInput);
            System.out.println(num*num*num);
        }
    }
}
