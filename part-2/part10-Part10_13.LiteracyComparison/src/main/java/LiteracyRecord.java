/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utsav
 */
public class LiteracyRecord implements Comparable<LiteracyRecord>{
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double percent;
    
    public LiteracyRecord(String theme, String ageGroup, String gender, String country, int year, double percent){
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
    
    
    
    
    @Override
    public int compareTo(LiteracyRecord r2){
        return Double.compare(this.percent, r2.percent);
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + percent;
    }
}
