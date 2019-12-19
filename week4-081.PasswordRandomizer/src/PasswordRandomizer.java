import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private Random random_password = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        int i = 0;
        int charposition;
        String password = "";
        while(i<this.length){
            charposition = random_password.nextInt(alphabets.length());
            password += alphabets.charAt(charposition);
            i++;
        }
        return password;
    }
}
