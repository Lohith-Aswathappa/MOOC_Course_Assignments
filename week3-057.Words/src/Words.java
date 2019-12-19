import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean i = true;
        while(i == true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                i = false;
            }
            words.add(name);
        }
        System.out.println("You typed the following words:");
        for (int j = 0; j < words.size(); j++){
            System.out.println(words.get(j));
        }
    }
}
