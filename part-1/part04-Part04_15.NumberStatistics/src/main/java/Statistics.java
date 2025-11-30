
public class Statistics {
    //encapsulation
    private int cnt;
    private int sum;
    //private double avg;
    
    public Statistics(){
        this.cnt=0;
        this.sum=0;
    }
    
    public void addNumber(int num){
        this.cnt++;
        this.sum+=num;
    }
    
    public int getCount(){
        return this.cnt;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if (this.cnt==0){
            return 0.0;
        }else{
            return ((1.0*this.sum)/this.cnt);
        }
    }
    
    
}
