
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type your name:");
        String name = reader.nextLine();
        int length = calculateCharacters(name);
        System.out.print("Number of characters: " + length);

        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int result = text.length();
        return result;
    }
    
}
