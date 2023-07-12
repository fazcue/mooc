
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class BirdList {
    private ArrayList<Bird> list;
    
    public BirdList() {
        this.list = new ArrayList();
    }
    
    protected void add(Bird bird) {
        list.add(bird);
    }
    
    protected void newObservation(String birdName) {
        for (Bird bird : list) {
            if (bird.getName().equals(birdName)) {
                bird.growObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    protected void print() {
        for (Bird bird : list) {
            System.out.println(bird);
        }
    }
    
    protected void printByName(String birdName) {
        for (Bird bird : list) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
                return;
            }
        }
    }
}
