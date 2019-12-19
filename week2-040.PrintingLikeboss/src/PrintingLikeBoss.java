public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for(int i = 0; i < amount; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        for(int i = 0; i < amount; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int num = size-1;
        while(i <= size){
            printWhitespaces(num);
            printStars(i);
            i++;
            num--;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int num = height;
        while(i <= height*2){
            printWhitespaces(num-1);
            printStars(i);
            i = i + 2;
            num--;
        }
        for(int j = 0; j< 2; j++){
            printWhitespaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(4);
    }
}
