/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.HashMap;
public class Abbreviations {
    private HashMap abbMap;
    
    public Abbreviations(){
        this.abbMap = new HashMap <String, String>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return (this.abbMap.containsKey(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation){
        String exp = String.valueOf(this.abbMap.get(abbreviation));
        if (exp.equals("null")) return null;
        return exp;
    }
            
}
