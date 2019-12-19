
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int FirstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int SecondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers: " + (FirstNumber + SecondNumber));

        // Implement your program here. Remember to ask the input from user
    }
}
