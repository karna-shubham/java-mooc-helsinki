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
import java.util.HashMap;
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<String>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {

        ArrayList<String> emptyList = new ArrayList<>();
        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> temp = this.storage.get(storageUnit);
        temp.remove(item);
        if (temp.isEmpty()) this.storage.remove(storageUnit);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> temp = new ArrayList<>();
        for(String unit : this.storage.keySet()){
            if(this.storage.get(unit).size() > 0) temp.add(unit);
        }
        return temp;
    }
    
}
