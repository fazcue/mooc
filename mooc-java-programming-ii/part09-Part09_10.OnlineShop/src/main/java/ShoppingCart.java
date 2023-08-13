
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author facu
 */
public class ShoppingCart {
    private Map<String, Item> products;

    public ShoppingCart() {
        this.products = new HashMap();
    }
    
    public void add(String product, int price) {
        Item item = new Item(product, price);
        
        if (this.products.containsKey(product)) {
            this.products.get(product).increaseQuantity();
        } else {
            this.products.put(product, item);
        }
    }
    
    public int price() {
        int res = 0;
        
        for (Item item : this.products.values()) {
            res += item.price();
        }
        
        return res;
    }
    
    public void print() {
        for (Item item : this.products.values()) {
            System.out.println(item);
        }
    }
}
