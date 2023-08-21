
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author facu
 */
public class Employees {
    private final ArrayList<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public void add(List<Person> people) {
        this.list.addAll(people);
    }
    
    public void print() {
        Iterator<Person> it = this.list.iterator();
        
        while (it.hasNext()) {
            Person next = it.next();
            
            System.out.println(next);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> it = this.list.iterator();
        
        while (it.hasNext()) {
            Person next = it.next();
            
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> it = this.list.iterator();
        
        while (it.hasNext()) {
            Person next = it.next();
            
            if (next.getEducation() == education) {
                it.remove();
            }
        }
    }
}
