
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void print() {
        int count = 1;
        
        for (String task : list) {
            System.out.println(count + ": " + task);
            count++;
        }
    }
    
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
