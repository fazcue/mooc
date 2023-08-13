
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        this.list = new ArrayList();
    }
    
    public void add(double status) {
        this.list.add(status);
    }
    
    public void clear() {
        this.list.clear();
    }
    
    public double maxValue() {
        if (this.list.isEmpty()) return 0;
        
        double maxValue = this.list.get(0);
        
        for (double e : this.list) {
            if (e > maxValue)  maxValue = e;
        }
        
        return maxValue;
    }
    
    public double minValue() {
        if (this.list.isEmpty()) return 0;
        
        double minValue = this.list.get(0);
        
        for (double e : this.list) {
            if (e < minValue) minValue = e;
        }
        
        return minValue;
    }
    
    public double average() {
        if (this.list.isEmpty()) return 0;
        
        double sum = 0;
        
        for (double e : this.list) {
            sum += e;
        }
        
        return 1.0 * sum / this.list.size();
    }
    
    @Override
    public String toString() {
        return list.toString();
    }
}
