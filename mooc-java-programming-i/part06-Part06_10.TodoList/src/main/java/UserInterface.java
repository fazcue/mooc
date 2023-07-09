
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;
    
    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            actions(command);
        }
    }
    
    protected void actions(String command) {
        switch (command) {
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
    
    protected void add() {
        System.out.print("Task: ");
        String task = this.scanner.nextLine();
        
        tasks.add(task);
    }
    
    protected void list() {
        tasks.print();
    }
    
    protected void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(this.scanner.nextLine());
        
        this.tasks.remove(index);
    }
}
