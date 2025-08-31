
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int price1 = this.pricePerSquare * this.squares;
        int price2 = compared.pricePerSquare * compared.squares;
        return Math.abs(price1 - price2);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price1 = this.pricePerSquare * this.squares;
        int price2 = compared.pricePerSquare * compared.squares;

        if (price1 > price2) {
            return true;
        } else {
            return false;
        }
    }
}
