
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean i = true;
        // create here the ArrayList

        while(i == true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if (words.contains(name)){
                i = false;
                System.out.println("You have the word " + name + " twice");
            }
            words.add(name);
        }
        
    }
}
