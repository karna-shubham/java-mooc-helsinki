/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shuhbham
 */
public class Debt {
    
    //encapsulation
    private double interestRate;
    private double balance;
    
    //constructor
    public Debt(double initialBalance, double initialInterestRate){
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }
    
    //method to print the balance
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    //mehtod to print the interest amount
    public void waitOneYear(){
        this.balance = this.balance*this.interestRate;
    }
    
}
