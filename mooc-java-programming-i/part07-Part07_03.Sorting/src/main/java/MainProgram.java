
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
//        System.out.println("Smallest: " + smallest(array));
//        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
//        
//        System.out.println(indexOfSmallestFrom(array, 0));
//        System.out.println(indexOfSmallestFrom(array, 1));
//        System.out.println(indexOfSmallestFrom(array, 2));
//        
//        System.out.println(Arrays.toString(array));
//        swap(array, 1, 0);
//        System.out.println(Arrays.toString(array));
//        swap(array, 0, 3);
//        System.out.println(Arrays.toString(array));

        sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int n : array) {
            if (n < smallest) {
                smallest = n;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = -1;
        
        for (int i=0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallest = array[startIndex];
        
        for (int i=startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        
        array[index1] = array[index2];
        array[index2] = aux;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        //Recorro array
        for (int i=0; i < array.length; i++) {
            //Recorro buscando el indice del menor valor desde i
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            
            //Si indexOfSmallest es distinto a i, cambiar valores
            if (indexOfSmallest != i) {
                swap(array, indexOfSmallest, i);
            }
            
            //Imprimo array
            System.out.println(Arrays.toString(array));
        }
    }

}
