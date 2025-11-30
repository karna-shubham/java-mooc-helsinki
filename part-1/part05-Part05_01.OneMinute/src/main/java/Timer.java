public class Timer{
    private int sec;
    private int hunSec;
    
    //constructor
    public Timer(){
        this.sec = 0;
        this.hunSec = 0;
    }
    
    public void advance(){
        this.hunSec += 1;
        if (this.hunSec>=100){
            this.hunSec = 0;
            this.sec += 1;
            if (this.sec >= 60){
                this.sec = 0;
            }
            
        }
    }
    
    public String toString() {
        String return1;
        if (this.hunSec<10){
            return1 = "0"+String.valueOf(this.hunSec);
        }else{
            return1 = String.valueOf(this.hunSec);
        }
        if (this.sec < 10) {
            return "0" + this.sec + ":"+return1;
        }

        return this.sec + ":" + return1;
    }
}
