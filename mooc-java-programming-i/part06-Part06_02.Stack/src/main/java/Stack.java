
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Stack {
    ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        int size = this.list.size();
        
        String last = this.list.get(size - 1);
        
        this.list.remove(size - 1);
        
        return last;
    }
}
