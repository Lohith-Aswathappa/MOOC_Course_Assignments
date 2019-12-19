
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        boolean i = true;

        while(i == true){
            System.out.print("Type a word: ");
            String new_names = reader.nextLine();
            names.add(new_names);

            if(new_names.isEmpty() == true){
                i = false;
            }
        }

        Collections.sort(names);
        for (String print_name : names) {
            System.out.println(print_name);
        }
    }
}
