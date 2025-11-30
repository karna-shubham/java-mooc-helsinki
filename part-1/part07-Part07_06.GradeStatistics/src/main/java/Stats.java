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
public class Stats {
    private ArrayList<Float> nums;
    
    public Stats(){
        this.nums = new ArrayList<>();
    }
    
    public String pointsAverage(ArrayList<Float> num){
        float sum = 0;
        for (float i : num) sum += i;
        float avg = sum/(num.size());
        return "Point average (all): " + avg;
    }
    
    public String passingAverage(ArrayList<Float> num){
        float cntPassing = 0, sumPassing = 0;
        for (float i : num){
            if (i>=50){
                cntPassing ++;
                sumPassing += i;
            }
        }
        if (cntPassing == 0) return "Point average (passing): -";
        return "Point average (passing): " + ((sumPassing/cntPassing));
    }
    
    public String passingPercentage(ArrayList<Float> num){
        float cntPass = 0, cntValid = num.size();
        for(float i : num){
            if (i >= 50) cntPass ++;
        }
        return "Pass percentage: " + (100* cntPass/cntValid);
    }
    
    public void gradeDistribution(ArrayList<Float> num){
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0;
        for(float i : num){
            if (i < 50) cnt0 ++;
            if (i >= 50 && i < 60) cnt1 ++;
            if (i >= 60 && i < 70) cnt2 ++;
            if (i >= 70 && i < 80) cnt3 ++;
            if (i >= 80 && i < 90) cnt4 ++;
            if (i >= 90) cnt5 ++;
        }
        System.out.println("Grade distribution:\n" +
                            "5: "+ "*".repeat(cnt5) + "\n" +
                            "4: "+ "*".repeat(cnt4) + "\n" +
                            "3: "+ "*".repeat(cnt3) + "\n" +
                            "2: "+ "*".repeat(cnt2) + "\n" +
                            "1: "+ "*".repeat(cnt1) + "\n" +
                            "0: "+ "*".repeat(cnt0) );
    }
}
