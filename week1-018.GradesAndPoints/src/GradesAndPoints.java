
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points <= 29)
            System.out.println("Grade: " + "failed");
        else if (points > 29 && points <= 34)
            System.out.println("Grade: " + 1);
        else if (points > 34 && points <= 39)
            System.out.println("Grade: " + 2);
        else if (points > 39 && points <= 44)
            System.out.println("Grade: " + 3);
        else if (points > 44 && points <= 49)
            System.out.println("Grade: " + 4);
        else if (points > 49 && points <= 60)
            System.out.println("Grade: " + 5);

    }
}
