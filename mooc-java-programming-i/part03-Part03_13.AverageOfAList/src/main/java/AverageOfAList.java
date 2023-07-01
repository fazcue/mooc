
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> list = new ArrayList();
        
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == -1) {
                break;
            }
            
            list.add(n);
        }
        
        int sum = 0;
        
        for (Integer n : list) {
            sum += n;
        }
        
        System.out.println("Average: " + (1.0 * sum / list.size()));
        
    }
}
