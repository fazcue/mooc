
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Package {
    private ArrayList<Gift> list;
    
    public Package() {
        this.list = new ArrayList();
    }
    
    public void addGift(Gift gift) {
        this.list.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        
        for (Gift gift : list) {
            total += gift.getWeight();
        }
        
        return total;
    }
}
