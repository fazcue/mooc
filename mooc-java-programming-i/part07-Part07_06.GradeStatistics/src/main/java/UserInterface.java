
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private PointList points;
    private Scanner scanner;
        
    public UserInterface() {
        this(new Scanner(System.in));
    }
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.points = new PointList();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }
        
        pointsAverage();
        pointsAveragePassing();
        passPercentage();
        gradeDistribution();
    }
    
    private void pointsAverage() {
        System.out.println("Point average (all): " + points.getAverage());
    }
    
    private void pointsAveragePassing() {
        double average = points.getAveragePassing();
        
        System.out.print("Point average (passing): ");
        
        if (average != -1) {
            System.out.println(average);
        } else {
            System.out.println("-");
        }
    }
    
    private void passPercentage() {
        System.out.println("Pass percentage: " + points.getPassPercentage());
    }
    
    private void gradeDistribution() {
        System.out.println("Grade distribution:");
        int[] grades = points.getGrades();
        
        for (int i=grades.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + printStars(grades[i]));
        }
    }
    
    private String printStars(int grade) {
        String string = "";
        for (int i=0; i < grade; i++) {
            string += "*";
        }
        
        return string;
    }
}
