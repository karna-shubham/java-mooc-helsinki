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
public class Package {
    private ArrayList<Gift> list;
    
    public Package(){
        this.list = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.list.add(gift);
    }
    
    public int totalWeight(){
        int total = 0;
        for (Gift item : this.list) total += item.getWeight();
        return total;
    }
}
