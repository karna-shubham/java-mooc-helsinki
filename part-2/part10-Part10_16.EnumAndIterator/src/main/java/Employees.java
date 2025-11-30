/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Employees {
    private List<Person> ppl;
    
    public Employees(){
        this.ppl = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        ppl.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        ppl.addAll(peopleToAdd);
    }
    
    public void print(){
        Iterator<Person> iterator = ppl.iterator();
        while (iterator.hasNext()) 
            System.out.println(iterator.next());
    }
    
    public void print(Education education){
        Iterator<Person> iterator = ppl.iterator();
        while (iterator.hasNext()) {
            Person temp = iterator.next();
            if(temp.getEducation() == education) System.out.println(temp);
        }
            
    }
        
    
    
    public void fire(Education education){
        Iterator<Person> iterator = ppl.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEducation() == education) iterator.remove();
        }
    }
    
}
