
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String FirstName = reader.nextLine();

        System.out.print("Type your age ");
        int FirstAge = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String SecondName = reader.nextLine();

        System.out.print("Type your age: ");
        int SecondAge = Integer.parseInt(reader.nextLine());

        System.out.print(FirstName + " and " + SecondName + " are " + (FirstAge + SecondAge) + " years old in total.");
        // Implement your program here
    }
}
