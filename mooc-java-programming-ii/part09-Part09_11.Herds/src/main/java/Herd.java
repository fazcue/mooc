
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author facu
 */
public class Herd implements Movable {
    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList();
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : this.list) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";
        
        for (Movable movable : this.list) {
            string += movable + "\n";
        }
        
        return string;
    }
}
