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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold (int initialMaxWeight){
        this.maxWeight = initialMaxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase s){
        
        if (s.totalWeight() + totalWeight() <= this.maxWeight) this.suitcases.add(s);     
        
        
    }
    
    public void printItems(){
        for (Suitcase i : suitcases){
            i.printItems();
        }
    }
    
    public int totalWeight (){
        int total = 0;
        for (Suitcase temp : this.suitcases) total += temp.totalWeight();
        return total;
    }
    
    @Override
    public String toString(){
        if (this.suitcases.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight() + " kg)";
        } else {
            return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
        }
    }
}
