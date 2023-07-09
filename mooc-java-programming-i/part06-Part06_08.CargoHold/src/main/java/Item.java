/**
 *
 * @author facu
 */
public class Item {
    private String name;
    private int weight;
    
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1) + " (" + this.weight + " kg)";
    }
}
