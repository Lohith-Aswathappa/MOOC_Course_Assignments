import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array){
        int length = array.length;
        int temp = array[0];
        int[] tempArray = array;
            for(int i = 0; i < length; i++){
                if(i+1 == length){
                    break;
                }
                else if(tempArray[i] > tempArray[i+1]){
                    if(tempArray[i+1] < temp){
                        temp = tempArray[i+1];
                    }
                }
        }
        return temp;
    }

    public static int indexOfTheSmallest(int[] array) {
        int length = array.length;
        int temp = array[0];
        int smallindex = 0;
        int[] tempArrayIndex = array;
        for(int i = 0; i < length; i++){
            if(i+1 == length){
                break;
            }
            else if(tempArrayIndex[i] > tempArrayIndex[i+1]){
                if(tempArrayIndex[i+1] < temp){
                    temp = tempArrayIndex[i+1];
                    smallindex = i+1;
                }
            }
        }
        return smallindex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int length = array.length;
        int temp = array[index];
        int indexfrom = index;
        int[] tempArrayIndexfrom = array;
        for(int i = indexfrom; i < length; i++){
            if(i+1 == length){
                break;
            }
            else if(tempArrayIndexfrom[i] > tempArrayIndexfrom[i+1]){
                if(tempArrayIndexfrom[i+1] < temp){
                    temp = tempArrayIndexfrom[i+1];
                    indexfrom = i+1;
                }
            }
        }
        return indexfrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempswap = 0;

        tempswap = array[index1];
        array[index1] = array[index2];
        array[index2] = tempswap;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }


}
