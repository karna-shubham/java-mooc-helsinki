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
public class Herd implements Movable {
    private ArrayList<Movable> herdList;
    
    public Herd(){
        this.herdList = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herdList.add(movable);
    }
    
    @Override
    public String toString(){
        String result = "";
        for (Movable temp : herdList){
            result = result + temp.toString() + "\n";
        }
        return result;
    }
    
    @Override
    public void move(int dx, int dy){
        for (Movable temp : herdList){
            temp.move(dx, dy);
        }
    }
    
}
