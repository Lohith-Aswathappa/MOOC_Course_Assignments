import java.util.ArrayList;

public class SumOfNumbers {
    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        int j = list.size();
        for(int i = j-1; i>=0;i--){
            total += list.get(i);
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum: " + sum(list));

        list.add(10);
        
        System.out.println("The sum: " + sum(list));
    }

}
