
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println(checker.isDayOfWeek(input));
        
        System.out.print("Enter a string: ");
        input = scanner.nextLine();
        
        System.out.println(checker.allVowels(input));
        
        System.out.print("Enter a string: ");
        input = scanner.nextLine();
        
        if (checker.timeOfDay(input)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
