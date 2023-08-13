
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author facu
 */
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.products = new HashMap();
        this.stock = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            int actualStock = this.stock.get(product);
            
            if (actualStock > 0) {
                this.stock.put(product, actualStock - 1);
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
}
