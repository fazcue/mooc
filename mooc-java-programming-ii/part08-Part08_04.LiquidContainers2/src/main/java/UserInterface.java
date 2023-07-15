
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private Container first;
    private Container second;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.first = new Container();
        this.second = new Container();
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("First: " + this.first);
            System.out.println("Second: " + this.second);
            
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] userInput = input.split(" ");
            
            String command = userInput[0];
            int quantity = Integer.valueOf(userInput[1]);
            
            actions(command, quantity);
        }
    }
    
    private void actions(String command, int quantity) {
        switch (command) {
            case "add":
                add(quantity);
                break;
            case "move":
                move(quantity);
                break;
            case "remove":
                remove(quantity);
                break;
        }
    }
    
    private void add(int quantity) {
        first.add(quantity);
    }
    
    private void move(int quantity) {
        if (first.contains() < quantity) {
            quantity = first.contains();
        }
        
        first.remove(quantity);
        second.add(quantity);
    }
    
    private void remove(int quantity) {
        second.remove(quantity);
    }
}
