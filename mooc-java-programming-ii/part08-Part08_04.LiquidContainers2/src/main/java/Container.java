/**
 *
 * @author facu
 */
public class Container {
    private int amount;
    private final int maxCapacity;
    
    public Container() {
        this(0, 100);
    }
    
    public Container(int amount, int maxCapacity) {
        this.amount = amount;
        this.maxCapacity = maxCapacity;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
        
            if (this.amount > this.maxCapacity) {
                this.amount = this.maxCapacity;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
        
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/" + this.maxCapacity;
    }
}
