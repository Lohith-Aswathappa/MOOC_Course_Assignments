
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = reader.nextLine();

        System.out.print("Type your password: ");
        String psd = reader.nextLine();

        if(username.equals("alex") && psd.equals("mightyducks"))
            System.out.print("You are now logged into the system!");
        else if(username.equals("emily") && psd.equals("cat"))
            System.out.print("You are now logged into the system!");
        else
            System.out.print("Your username or password is invalid");
    }
}
