

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UI {
    private final Scanner scanner;
    private final ArrayList<Book> books;

    public UI(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }
    
    public void start() {
        askForBooks();
        printTotalBooks();
        sortedBooks();
        printBooks();
    }
    
    private void askForBooks() {
        while (true) {            
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) break;
            
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            
            this.books.add(new Book(name, ageRecommendation));
            
            System.out.println("");
        }
        
        System.out.println("");
    }
    
    private void printTotalBooks() {
        System.out.println(this.books.size() + " books in total.\n");
    }
    
    private void sortedBooks() {
        Collections.sort(this.books, Comparators.compareByName);
        Collections.sort(this.books, Comparators.compareByAgeRecommendation);
    }
    
    private void printBooks() {
        this.books.stream()
                
                .forEach(book -> System.out.println(book));
    }
}
