
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == -1) {
                break;
            }
            
            statistics1.addNumber(n);
            
            if (n % 2 == 0) {
                statistics2.addNumber(n);
            } else {
                statistics3.addNumber(n);
            }
        }
        
        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());
    }
}
