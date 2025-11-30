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
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensors;
    private List<Integer> listAver;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.listAver = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn(){
        for (Sensor i : sensors) if (i.isOn() == false) return false;
        return true;
    }
    
    @Override
    public void setOn(){
        for (Sensor i : sensors) i.setOn();
    }
    
    @Override
    public void setOff(){
        for (Sensor i : sensors) i.setOff();
    }
    
    @Override
    public int read(){
        if (!(isOn()) || sensors.isEmpty()) throw new IllegalStateException();
        int sum = 0;
        for (Sensor i : sensors) sum += i.read();
        int avg = (sum/sensors.size());
        listAver.add(avg);
        return avg;
    }
    
    public List<Integer> readings(){
        return listAver;
    }
}
