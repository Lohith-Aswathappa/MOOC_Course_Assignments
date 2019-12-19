import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        boolean i = true;
        while(i == true){
            System.out.print("Type a word: ");
            String new_name = reader.nextLine();
            names.add(new_name);
            if(new_name.isEmpty() == true){
                i = false;
            }
        }
        int Array_size = names.size();
        System.out.println("You typed the following words: ");
        for (int j = Array_size-1; j >= 0; j--){
            System.out.println(names.get(j));
        }
    }
}
