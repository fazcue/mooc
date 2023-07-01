
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        String longestName = "";
        int sumBirthYears = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] array = input.split(",");
            
            String name = array[0];
            int birthYear = Integer.valueOf(array[1]);
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            sumBirthYears += birthYear;
            count++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumBirthYears / count));
        
    }
}
