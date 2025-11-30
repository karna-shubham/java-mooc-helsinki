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
public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> box;
    
    public Box(double weight){
        this.maxWeight = weight;
        this.box = new ArrayList<>();
        
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for (Packable temp : this.box) weight += temp.weight();
        return weight;
    }
    
    public void add(Packable item){
        if (this.weight() + item.weight() <= this.maxWeight){
            box.add(item);
            
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }
    
    
    
    
}
