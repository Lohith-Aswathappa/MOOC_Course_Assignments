import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int even = 0;
        int odd  = 0;

        while(true){
            System.out.print("Type numbers: ");
            int num = Integer.parseInt(reader.nextLine());

            if(num == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += num;
            i++;

            if(num%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many number: " + i);
        float average = (float)(sum)/i;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
