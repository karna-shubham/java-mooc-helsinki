/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {//constructor here
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) { //method 1
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) { //method 2
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
