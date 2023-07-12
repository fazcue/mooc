
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] array2 = {"hello", "world", "bye"};
        ArrayList<Integer> integers = new ArrayList();
        ArrayList<String> strings = new ArrayList();
        
        integers.add(4);
        integers.add(2);
        integers.add(0);
        
        strings.add("hello");
        strings.add("world");
        strings.add("bye");
        
        sort(array);
        sort(array2);
        sortIntegers(integers);
        sortStrings(strings);
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers.toString());
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings.toString());
    }

}
