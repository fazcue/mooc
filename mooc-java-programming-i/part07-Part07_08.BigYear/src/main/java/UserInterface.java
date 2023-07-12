
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private BirdList birds;
    private Scanner scanner;
    
    public UserInterface() {
        this(new Scanner(System.in));
    }
    
    public UserInterface(Scanner scanner) {
        this.birds = new BirdList();
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            
            actions(input);
        }
    }
    
    protected void actions(String input) {
        switch (input) {
            case "Add":
                addBird();
                break;
            case "Observation":
                observationOfBird();
                break;
            case "All":
                printAllBirds();
                break;
            case "One":
                printOneBird();
                break;
        }
    }
    
    protected void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine();
        
        Bird bird = new Bird(name, latin);
        
        birds.add(bird);
    }
    
    protected void observationOfBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        
        birds.newObservation(birdName);
    }
    
    protected void printAllBirds() {
        birds.print();
    }
    
    protected void printOneBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        
        birds.printByName(birdName);
    }
}
