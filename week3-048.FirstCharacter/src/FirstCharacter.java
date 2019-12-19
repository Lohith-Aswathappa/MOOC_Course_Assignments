import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char first = firstCharacter(name);
        System.out.println("First character: " + first);
    }

    public static char firstCharacter(String text){
        char result = text.charAt(0);
        return result;
    }
}
