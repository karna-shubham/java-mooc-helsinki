/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
public class Container {
    private int cont;
    
    public Container(){
        this.cont = 0;
    }
    
    public int contains() {
        return this.cont;
    }
    
    public void add(int amount){
        if (amount>0){
            this.cont = this.cont + amount;
        }
        if (this.contains()>100) this.cont = 100;        
    }
    
    public void remove(int amount){
        
        if (amount > this.contains()){
            this.cont = 0;
            
        }else if (amount > 0){
            this.cont = this.cont - amount;
        }else if (this.contains()<0) this.cont = 0;
        
    }
    
    @Override
    public String toString(){
        return this.contains() + "/100";
    }
}
