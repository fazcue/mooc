
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                String[] data = row.split(",");
                
                String name = data[0];
                int age = Integer.valueOf(data[1]);
                
                System.out.print(name + ", age: " + age + " year");
                
                if (age > 1 || age == 0) {
                    System.out.print("s");
                }
                
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
