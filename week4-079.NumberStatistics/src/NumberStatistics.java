
public class NumberStatistics {
    private int amountOfNumbers;
    private int number;

    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.number = 0;
    }

    public void addNumber(int number){
        this.number +=number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum(){
        return this.number;
    }

    public double average(){
        if(this.number == 0){
            return 0;
        }
        return (double)this.number/this.amountOfNumbers;
    }
}
