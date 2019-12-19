
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        else
            return false;
    }

    public int priceDifference(Apartment otherApartment){
        this.price = ((this.pricePerSquareMeter*this.squareMeters) -(otherApartment.pricePerSquareMeter*otherApartment.squareMeters));

        if(this.price > 0){
            return this.price;
        }
        else{
            return this.price*-1;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        if((this.pricePerSquareMeter*this.squareMeters) > (otherApartment.pricePerSquareMeter*otherApartment.squareMeters)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
