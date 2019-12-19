
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int First = Integer.parseInt(reader.nextLine());

        System.out.print("Type a number: ");
        int Second = Integer.parseInt(reader.nextLine());

        int result = Math.max(First,Second);

        System.out.print("The bigger number of the two number given was: " + result);

        // Implement your program here. Remember to ask the input from user
    }
}
