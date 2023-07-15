
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private TodoList todos;
    private Scanner scanner;
    
    public UserInterface(TodoList todos, Scanner scanner){
        this.todos = todos;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            actions(input);
        }
    }
    
    private void actions(String input) {
        switch (input) {
            case "add":
                add();
                break;
            case "list":
                list();
                break;
            case "remove":
                remove();
                break;
        }
    }
    
    private void add() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        
        todos.add(task);
    }
    
    private void list() {
        todos.print();
    }
    
    private void remove() {
        System.out.print("Which one is removed? ");
        int selected = Integer.valueOf(this.scanner.nextLine());
        
        todos.remove(selected);
    }
}
