
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sumPositives = 0;
        
        while (true) {
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if (n1 == 0) {
                break;
            }
            
            if (n1 > 0) {
                sumPositives += n1;
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println(1.0 * sumPositives / count);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
