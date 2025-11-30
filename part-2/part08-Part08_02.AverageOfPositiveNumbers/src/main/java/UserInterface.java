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
        this.scan = new Scanner(System.in);
    }
    
    public void start(){
        float sum = 0, cnt = 0;
        while (true){
            float num = Float.valueOf(scan.nextLine());
            if (num == 0){
                break;
            }
            if (num > 0){
                sum += num;
                cnt ++;
            }
            
        }
        
        if (cnt == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum/cnt);
        }
        
        
    }
}
