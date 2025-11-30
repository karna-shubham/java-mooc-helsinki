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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translate1;
    
    public DictionaryOfManyTranslations (){
        this.translate1 = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.translate1.putIfAbsent(word, new ArrayList<>());
        this.translate1.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> empty = new ArrayList<>();
        if (this.translate1.containsKey(word)){
            return this.translate1.get(word);
        }else{
            return empty;
        }
        
    }
    
    public void remove(String word){
       if (this.translate1.containsKey(word)){
           this.translate1.remove(word);
       }else{
           System.out.println("Word does not exist");
       }
    }
}

