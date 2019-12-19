public class BoundedCounter {
    private int value_counter = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }

    public void next(){
        if(this.value_counter >= upperLimit){
            this.value_counter = 0;
        }
        else {
            this.value_counter++;
        }
    }

    public String toString(){
        if(this.value_counter <10){
            return "0" + this.value_counter;
        }
        else {
            return "" + this.value_counter;
        }
    }

    public int getValue(){
        return this.value_counter;
    }

    public void setValue(int newValue) {
        if (newValue > 0 && newValue <= this.upperLimit) {
            this.value_counter = newValue;
        }
    }

}
