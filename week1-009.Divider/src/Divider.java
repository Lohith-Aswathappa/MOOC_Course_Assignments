
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int FirstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        float SecondNumber = Integer.parseInt(reader.nextLine());

        double division = FirstNumber/SecondNumber;

        System.out.println("Division: " + FirstNumber + "/" + SecondNumber + " = " + division);

        // Implement your program here. Remember to ask the input from user.
    }
}
