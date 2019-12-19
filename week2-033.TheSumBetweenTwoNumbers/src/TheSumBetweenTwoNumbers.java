
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int First = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int Last = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (First <= Last){
            sum += First;
            First++;
        }
        System.out.println(sum);
    }
}
