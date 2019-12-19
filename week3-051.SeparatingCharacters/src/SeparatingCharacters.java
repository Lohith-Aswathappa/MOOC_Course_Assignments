
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 0;
        while(i < name.length()){
            System.out.println( (i+1) + ". Character: " + name.charAt(i));
            i++;
        }
    }
}
