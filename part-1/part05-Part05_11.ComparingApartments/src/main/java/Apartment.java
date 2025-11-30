
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int value = (this.squares * this.princePerSquare) - (compared.princePerSquare * compared.squares);
        if (value > 0) return value;
        return value * -1;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if ((this.squares * this.princePerSquare)>(compared.princePerSquare * compared.squares))return true;
        return false;
    }

}
