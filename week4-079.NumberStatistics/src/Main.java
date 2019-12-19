import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        boolean state = true;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        while(state){
            int read_input = Integer.parseInt(reader.nextLine());
            if(read_input < 0){
                state = false;
                break;
            }
            else{
                stats.addNumber(read_input);
            }

            if((read_input%2) == 0){
                even.addNumber(read_input);
            }
            else{
                odd.addNumber(read_input);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
