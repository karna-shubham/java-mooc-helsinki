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
public class Stack {
    
    private ArrayList<String> stack = new ArrayList<>();
    
    public Stack (){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.stack.size() == 0) return true;
        return false;
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public String take(){
        String var1 = this.stack.remove(this.stack.size()-1);
        return var1;
    }
}
