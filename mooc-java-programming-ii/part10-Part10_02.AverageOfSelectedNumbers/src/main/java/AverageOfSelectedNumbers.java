
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {            
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("end")) break;
            
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String selected = scanner.nextLine();
        
        average(inputs, selected);
    }
    
    public static void average(ArrayList<String> inputs, String type) {
        double avg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(value -> type.equalsIgnoreCase("n") ? value < 0 : value > 0)
                .average()
                .getAsDouble();
        
        String averageType = type.equalsIgnoreCase("n") ? "negative" : "positive";
        
        System.out.println("Average of the " + averageType + ": " + avg);
    }
}
