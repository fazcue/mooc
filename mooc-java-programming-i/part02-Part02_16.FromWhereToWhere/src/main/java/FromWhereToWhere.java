
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int n1 = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from?");
        int n2 = Integer.valueOf(scanner.nextLine());
        
        for (int i = n2; i <= n1; i++) {
            System.out.println(i);
        }
    }
}
