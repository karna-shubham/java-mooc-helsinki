/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
public class Person {
    private String name;
    private String add;
    
    public Person(String initialName, String initialAdd){
        this.name = initialName;
        this.add = initialAdd;
    }
    
    @Override
    public String toString(){
        return this.name + "\n" + "  " + this.add;
    }
}
