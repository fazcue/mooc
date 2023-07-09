
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int currentWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList();
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
    }
    
    public Suitcase() {
        this(0);
    }
    
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.currentWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        if (this.items.size() > 1) {
            for (Item item : items) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;
                }
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String string = this.items.size() + " item";
        
        if (items.size() > 1) {
            string += "s";
        }
        
        string += " (" + this.currentWeight + " kg)";

        return string;
    }
}
