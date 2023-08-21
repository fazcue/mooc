
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> list = readLiteracy("literacy.csv");
        
        list.stream()
                .sorted()
                .forEach(literacy -> System.out.println(literacy));
        
    }
    
    public static ArrayList<Literacy> readLiteracy(String file) {
        ArrayList<Literacy> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(row -> new Literacy(row[0].trim(), row[1].trim(), row[2].replace("(%)", "").trim(), row[3].trim(), Integer.valueOf(row[4].trim()), Double.valueOf(row[5].trim())))
                    .forEach(literacy -> rows.add(literacy));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return rows;
    }
}
