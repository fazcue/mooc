
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class OneItemBox extends Box {
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
       if (this.items.isEmpty()) {
           this.items.add(item);
       }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
