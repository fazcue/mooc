/**
 *
 * @author facu
 */
public class Container {
    private int amount;
    private int maxCapacity;
    
    public Container(int amount, int maxCapacity) {
        this.amount = amount;
        this.maxCapacity = maxCapacity;
    }
    
    public Container() {
        this(0, 100);
    }
    
    public void add(int amount) {
        int absAmount = Math.abs(amount);
        
        this.amount += absAmount;
        
        if (this.amount > maxCapacity) {
            this.amount = maxCapacity;
        }
    }
    
    public void remove(int amount) {
        int absAmount = Math.abs(amount);
        
        this.amount -= absAmount;
        
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public int contains() {
        return amount;
    }
    
    @Override
    public String toString() {
        return amount + "/" + maxCapacity;
    }
}
