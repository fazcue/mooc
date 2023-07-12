
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputs = input.split(" ");
            
            String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            if (command.equals("add")) {
                first += Math.abs(amount);
                
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (command.equals("move")) {
                if (first < amount) {
                    amount = first;
                }
                
                first -= amount;
                second += amount;
                
                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove")) {
                second -= amount;
                
                if (second < 0) {
                    second = 0;
                }
            }

        }
    }

}
