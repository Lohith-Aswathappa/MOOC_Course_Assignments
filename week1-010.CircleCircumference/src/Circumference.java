
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        float radius = Float.parseFloat(reader.nextLine());

        double circumference = 2 * radius * Math.PI;

        System.out.println("Circumference of the circle: " + circumference);

        // Program your solution here 
    }
}
