
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        menu();
    }
    
    private void menu() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("X")) {
                break;
            }
            
            int selectedOption = Integer.valueOf(input);
            
            switch (selectedOption) {
                case 1:
                    add();
                    break;
                case 2:
                    draw();
                    break;
                case 3:
                    list();
                    break;
            }
        }

    }
    
    private void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        
        jokes.addJoke(joke);
    }
    
    private void draw() {
        System.out.println("Drawing a joke.");
        System.out.println(jokes.drawJoke());
    }
    
    private void list() {
        System.out.println("Printing the jokes.");
        jokes.printJokes();
    }
}
