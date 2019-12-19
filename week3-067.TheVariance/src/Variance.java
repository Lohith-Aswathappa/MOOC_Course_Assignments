import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        int j = list.size();
        for (int i = j - 1; i >= 0; i--) {
            total += list.get(i);
        }
        return total;
    }
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {

        double aver = (double)sum(list)/list.size();
        return aver;
    }

    public static double variance(ArrayList<Integer> list) {
        double total = 0;
        double square = 0;
        double difference = 0;
        double avera = average(list);
        for (int i = 0; i<list.size();i++){
            total = list.get(i) - avera;
            //System.out.println(total);
            square = total*total;
            //System.out.println(square);
            difference += square ;
            //System.out.println(difference);
        }
        double var = difference/(list.size()-1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
