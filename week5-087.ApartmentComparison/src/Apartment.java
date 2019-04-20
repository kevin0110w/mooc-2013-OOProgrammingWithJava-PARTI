
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        boolean isLarger = false;
        if (this.squareMeters > otherApartment.squareMeters) {
            isLarger = true;
        }
        return isLarger;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int priceDifferenceOfThis = this.squareMeters * this.pricePerSquareMeter ;
        int priceDifferenceOfOther = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int priceDifference = Math.abs(priceDifferenceOfThis - priceDifferenceOfOther);
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        boolean isMoreExpensiveThan = false;
        int priceDifferenceOfThis = this.squareMeters * this.pricePerSquareMeter ;
        int priceDifferenceOfOther = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (priceDifferenceOfThis > priceDifferenceOfOther ) {
            isMoreExpensiveThan = true;
    }
        return isMoreExpensiveThan;
}
}