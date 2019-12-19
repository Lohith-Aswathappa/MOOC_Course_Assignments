import java.util.ArrayList;
import java.util.Collections;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        Collections.sort(list);
        int i = list.size();
        int j = list.get(i-1);
        return j;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        //lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
