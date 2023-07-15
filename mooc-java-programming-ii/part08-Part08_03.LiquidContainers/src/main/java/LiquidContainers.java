
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            System.out.print("> ");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputValues = input.split(" ");
            
            String command = inputValues[0];
            int quantity = Integer.valueOf(inputValues[1]);
            
            if (command.equals("add") && quantity > 0) {
                first += quantity;
                
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (command.equals("move") && quantity > 0) {
                if (first < quantity) {
                    second += first;
                    first = 0;
                } else {
                    second += quantity;
                    first -= quantity;
                }
                
                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove") && quantity > 0) {
                second -= quantity;
                
                if (second < 0) {
                    second = 0;
                }
            }

        }
    }

}
