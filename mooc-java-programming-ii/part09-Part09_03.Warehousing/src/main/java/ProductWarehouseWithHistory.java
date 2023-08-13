/**
 *
 * @author facu
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity, initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double newBalance = super.takeFromWarehouse(amount);
        
        this.history.add(getBalance());
        
        return newBalance;
    }

    public String history() {
        return this.history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
