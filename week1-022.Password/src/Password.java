
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while(true){
            System.out.print("Type the password: ");
            String requestPassword = reader.nextLine();
            if(requestPassword.equals("carrot")) {
                System.out.println("Right!");
                System.out.print("The secret message: jryy qbar!");
                break;
            }
            else
                System.out.println("Wrong!");
        }

        // Write your code here
    }
}
