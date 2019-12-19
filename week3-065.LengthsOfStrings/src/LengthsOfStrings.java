import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        int sizeOfList = 0;
        String temp;
        int i = 0;
        int Temp_size = 0;
        while(sizeOfList < list.size()){
            temp = list.get(i);
            Temp_size = temp.length();
            lengthList.add(Temp_size);
            i++;
            sizeOfList++;
        }
        
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
