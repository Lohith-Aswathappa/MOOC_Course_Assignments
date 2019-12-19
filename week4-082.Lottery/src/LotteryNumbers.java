import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int max = 39;
    private int min = 1;
    private int lottery_length = 7;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        int lottery = 0;
        while(i < lottery_length){
            lottery = random.nextInt(max - min + 1) + min;
            if(!this.numbers.contains(lottery)){
                this.numbers.add(lottery);
                i++;
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
