
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        int size = this.elements.size();
        
        String printOut = "The collection " + this.name + " ";
        
        if (size == 0) {
            printOut += "is empty.";
        } else {
            printOut += "has " + size + " ";
        }

        if (size == 1) {
            printOut += "element:\n";
        }
        
        if (size > 1) {
            printOut += "elements:\n";
        }
        
        for (int i=0; i < size; i++) {
            printOut += this.elements.get(i);
            
            if (i != size - 1) {
                printOut += "\n";
            }
        }
        
        return printOut;
    }
    
}
