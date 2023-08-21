
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> inputs = new ArrayList();
        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {            
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("end")) break;
            
            inputs.add(input);
        }
        
        average(inputs);
    }
    
    public static void average(ArrayList<String> inputs) {
        double average = inputs.stream().mapToInt(value -> Integer.valueOf(value)).average().getAsDouble();
        
        System.out.println("average of the numbers: " + average);
    }
}
