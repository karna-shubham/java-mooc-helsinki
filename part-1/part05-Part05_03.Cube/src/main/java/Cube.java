public class Cube{
    
    //instance variables
    int edgeLength;
    int cubeVolume;
    
    //constructor
    public Cube (int initialEdgeLength){
        this.edgeLength = initialEdgeLength;
    }
    
    public int volume(){
        return this.edgeLength * this.edgeLength * this.edgeLength;
        
    }
    
    //toString
    public String toString(){
        return "The length of the edge is "+ this.edgeLength + " and the volume " + this.volume();
    }
}

//The length of the edge is l and the volume v