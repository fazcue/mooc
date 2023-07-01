
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbers = new ArrayList();
        
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 9999) {
                break;
            }
            
            numbers.add(n);
        }
        
        //get smallest
        int smallest = numbers.get(0);
        
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        //Print all smallest with indexes
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
