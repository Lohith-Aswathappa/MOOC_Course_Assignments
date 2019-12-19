
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        int newEuros = added.euros + this.euros;
        int newCents = added.cents + this.cents;

        return new Money(newEuros, newCents);
    }


    public boolean less(Money compared) {
        if(this.euros > compared.euros){
            return false;
        }

        if (this.euros == compared.euros){
            if(this.cents > compared.cents){
                return false;
            }
        }
        return true;
    }

    public Money minus(Money decremented){
        int newEuros1 = this.euros - decremented.euros;
        int newCents1 = this.cents - decremented.cents;
        if(newEuros1 < 0){
            return new Money(0,0);
        }
        else if (newCents1 < 0){
            newEuros1 = newEuros1 - 1;
            newCents1 = 100 + newCents1;
        }
        return new Money(newEuros1, newCents1);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
