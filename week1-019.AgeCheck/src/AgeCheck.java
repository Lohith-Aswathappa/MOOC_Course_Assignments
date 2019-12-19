
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int Age = Integer.parseInt(reader.nextLine());

        if(Age < 0 || Age > 120)
            System.out.println("Impossible");
        else
            System.out.print("OK");

    }
}
