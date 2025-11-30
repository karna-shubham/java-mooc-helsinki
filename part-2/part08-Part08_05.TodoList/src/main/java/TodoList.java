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
public class TodoList {
    private ArrayList<String> list;
    
    
    //constructors
    public TodoList(){
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        int cnt = 1; 
        for (String temp : this.list) {
            System.out.println(cnt + ": " + temp);
            cnt ++;
        }
    }
    
    public void remove(int number){
        if (number > 0){
            this.list.remove(number - 1);
        }else{
            System.out.println("Invalid");
        }
    }
}
