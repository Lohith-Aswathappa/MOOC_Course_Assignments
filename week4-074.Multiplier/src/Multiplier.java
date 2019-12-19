public class Multiplier {

    private int number;

    public Multiplier(int numberAtStart){
        this.number = numberAtStart;
    }

    public int multiply(int othernumber){
        this.number *= othernumber;
        return this.number;
    }
}
