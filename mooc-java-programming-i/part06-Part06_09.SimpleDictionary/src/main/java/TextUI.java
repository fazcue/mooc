
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            this.actions(command);
        }
        
        System.out.println("Bye bye!");
    }
    
    protected void actions(String command) {
        switch (command) {
            case "add":
                this.add();
                break;
            case "search":
                this.search();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
    protected void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();

        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();

        this.dictionary.add(word, translation);
    }
    
    protected void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
        
        String translation = this.dictionary.translate(word);
        
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        
        System.out.println("Translation: " + translation);
    }
}
