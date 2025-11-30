/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuhbham
 */
public class Multiplier {
    private int val;
    
    public Multiplier(int initialVal){
        this.val = initialVal;
    }
    
    public int multiply(int num){
        return (num*this.val);
    }
}
