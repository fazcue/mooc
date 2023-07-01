
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        String oldestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] array = input.split(",");
            
            int age = Integer.valueOf(array[1]);
            String name = array[0];
            
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
