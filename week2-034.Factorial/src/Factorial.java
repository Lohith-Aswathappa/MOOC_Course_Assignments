import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int fact = 1 ;
        while(num > 0){
            fact *= num;
            num--;
        }
        System.out.println(fact);
    }
}
