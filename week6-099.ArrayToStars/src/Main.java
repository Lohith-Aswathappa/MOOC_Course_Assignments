
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        int NumberOfStars;
        for(int i = 0; i < array.length; i++){
            NumberOfStars = array[i];
            for(int j = 0; j < NumberOfStars; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
