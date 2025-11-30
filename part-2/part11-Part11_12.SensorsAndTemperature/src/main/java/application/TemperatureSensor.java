/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Utsav
 */
import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean status;
    //private int cali;
    
    public TemperatureSensor(){
        this.status = false;
    }
    @Override
    public boolean isOn(){
        return this.status;
    }
    
    @Override
    public void setOn(){
        this.status = true;
    }
    
    @Override
    public void setOff(){
        this.status = false;
    }
    
    @Override
    public int read(){
        if (this.isOn()){
            Random r = new Random();
            return (r.nextInt(61) - 30);
        }
        throw new IllegalStateException();
    }
}
