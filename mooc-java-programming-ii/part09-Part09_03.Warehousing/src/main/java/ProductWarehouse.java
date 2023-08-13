/**
 *
 * @author facu
 */
public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity, double initialBalance) {
        super(capacity, initialBalance);
        this.name = name;
    }
    
    public ProductWarehouse(String name, double capacity) {
        this(name, capacity, 0.0);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
