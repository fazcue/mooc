
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author facu
 */
public class Hand implements  Comparable<Hand> {
    private ArrayList<Card> list;

    public Hand() {
        this.list = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.list.add(card);
    }
    
    public void print() {
        this.list.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(this.list);
    }
    
    public int sum() {
        return this.list.stream()
                .mapToInt(card -> card.getValue())
                .reduce(0, (curr, prev) -> curr + prev);
    }
    
    public void sortBySuit() {
        Collections.sort(this.list, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand compared) {
        return this.sum() - compared.sum();
    }
}
