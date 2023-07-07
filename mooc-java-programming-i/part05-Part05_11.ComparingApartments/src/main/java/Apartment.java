
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getSquares();
    }
    
    public int fullPrice() {
        return this.squares * this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        if (this.fullPrice() >= compared.fullPrice()) {
            return this.fullPrice() - compared.fullPrice();
        }
        
        return compared.fullPrice() - this.fullPrice();
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.fullPrice() > compared.fullPrice();
    }
}
