import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char last = lastCharacter(name);
        System.out.print("Last character: " + last);
    }

    public static char lastCharacter(String text){
        char result = text.charAt(text.length()-1);
        return result;
    }
}
