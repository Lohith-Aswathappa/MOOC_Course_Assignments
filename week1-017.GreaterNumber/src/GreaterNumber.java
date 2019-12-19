import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int First = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int Second = Integer.parseInt(reader.nextLine());

        if(First > Second)
            System.out.println("Greater number: " + First);
        else if(Second > First)
            System.out.println("Greater number: " + Second);
        else
            System.out.println("The number are equal!");

    }
}
