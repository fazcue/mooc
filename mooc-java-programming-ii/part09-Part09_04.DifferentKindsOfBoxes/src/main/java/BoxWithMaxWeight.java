
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight() {
        this(0);
    }
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
        int currentWeight = 0;
        
        for (Item savedItem : this.items) {
            currentWeight += savedItem.getWeight();
        }
        
        if (item.getWeight() + currentWeight <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
