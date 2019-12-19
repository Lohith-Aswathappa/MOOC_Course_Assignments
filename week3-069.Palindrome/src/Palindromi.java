import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int length = text.length();
        int i = 0;
        int j = length-1;
        Character result = null;
        if(length == 0){
            return true;
        }
        while(i <= text.length()/2){
            if(text.charAt(i)==text.charAt(j)){
                i++;
                j--;
                result = 'T';
            }
            else{
                i = (text.length()/2)+1;
                result = 'F';
            }
        }
        if(result.equals('T')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
