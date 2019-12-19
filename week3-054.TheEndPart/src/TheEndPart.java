import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        System.out.print("Length og the end part: ");
        int length_String = Integer.parseInt(reader.nextLine());
        int total_Length = name.length();
        int i = total_Length - length_String;

        System.out.println("Result: " + name.substring(i, total_Length));
    }
}
