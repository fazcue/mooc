
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void remove(int index) {
        this.list.remove(index - 1);
    }
    
    public void print() {
        int count = 1;
        
        for (String task : this.list) {
            System.out.println(count + ": " + task);
            count++;
        }
    }
}
