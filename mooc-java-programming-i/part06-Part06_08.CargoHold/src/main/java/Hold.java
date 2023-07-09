
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int currentWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList();
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
    }

    public Hold() {
        this(0);
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            for (Item item : suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }
}
