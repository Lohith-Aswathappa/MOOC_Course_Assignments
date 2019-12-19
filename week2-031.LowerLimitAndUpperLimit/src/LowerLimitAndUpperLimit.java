
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int First = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int Last = Integer.parseInt(reader.nextLine());

        while(First <= Last) {
            System.out.println(First);
            First++;
        }

    }
}
