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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int initalMaxWeight){
        this.maxWeight = initalMaxWeight;
        this.items = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        int total = this.totalWeight();
        if(item.getWeight()+total<=this.maxWeight){
            this.items.add(item);
            
        }
        
    }
    
    public void printItems(){
        for (Item temp : this.items){
            System.out.println(temp);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item i : this.items) {
            total += i.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem (){
        if (this.items.isEmpty()) return null;
        Item heaviest = this.items.get(0);
        for (Item i : this.items){
            if (heaviest.getWeight() < i.getWeight()) heaviest = i;
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

}
