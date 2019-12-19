
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int answer = -1;
        if((number1 >= number2) && (number1 > number3)) {
                answer = number1;
        }

        else if((number2 > number1) && (number2 > number3)) {
                answer = number2;
        }

        else if ((number3 > number1) && (number3 > number2)) {
            answer = number3;
        }

        else if((number1 == number2) && (number1 >= number3)){
            answer = number1;
        }

        else if((number2 == number3) && (number2 >= number1)){
            answer = number2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = greatest(-5,-8,-4);
        System.out.println("Greatest: " + result);
    }
}
