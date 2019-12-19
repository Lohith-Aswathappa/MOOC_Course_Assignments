import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        int count = 0;
        while (count < second.size()) {
            if (!first.contains(second.get(count))) {
                first.add(second.get(count));
            }
            count++;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}