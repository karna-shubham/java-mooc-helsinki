/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    private ArrayList<Float> nums;
    private Scanner scan;
    
    
    public UserInterface(){
        this.nums = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }
    
    public void start(){
        
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            float input = Float.valueOf(scan.nextLine());
            if (input == -1) break;
            if (input >=0 && input <=100) nums.add(input);
        }
        
        
    }
    
    public ArrayList<Float> get(){
        return this.nums;        
    }
    
    
}
