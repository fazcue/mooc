
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        
        while (true) {
            String string = scanner.nextLine();
            
            if (string.isEmpty()) {
                break;
            }
            
            String[] array = string.split(",");
            
            int age = Integer.valueOf(array[1]);
            
            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
