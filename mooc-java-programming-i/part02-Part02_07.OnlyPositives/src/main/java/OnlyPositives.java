
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if (n1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            
            if (n1 == 0) {
                break;
            }
            
            System.out.println(Math.pow(n1, 2));
        }

    }
}
