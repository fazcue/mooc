
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
    
    public UserInterface() {
        this(new Scanner(System.in));
    }
    
    public void start() {
        readInput();
    }
    
    private void readInput() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputs = input.split(" ");
            
            String command = inputs[0];
            int amount = Integer.valueOf(inputs[1]);
            
            menu(command, amount);
        }
    }
    
    private void menu(String command, int amount) {
        switch (command) {
            case "add":
                add(amount);
                break;
            case "move":
                move(amount);
                break;
            case "remove":
                remove(amount);
                break;
        }
    }
    
    private void add(int amount) {
        first.add(amount);
    }
    
    private void remove(int amount) {
        second.remove(amount);
    }
    
    private void move(int amount) {
        if (first.contains() >= amount) {
            second.add(amount);
        } else {
            second.add(first.contains());
        }
        
        first.remove(amount);
    }
}
