
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = "av";
        
        while (true) {
            String string = scanner.nextLine();
            
            if (string.isEmpty()) {
                break;
            }
            
            String[] array = string.split(" ");
            
            for (String s : array) {
                if (s.contains(text)) {
                    System.out.println(s);
                }
            }
        }
    }
}
