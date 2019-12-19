
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int size = list.size();
        int total = 0;
        for(int i = 0; i < size; i++){
            total += list.get(i);
        }
        return total;
    }
    

    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list)/list.size();

        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
