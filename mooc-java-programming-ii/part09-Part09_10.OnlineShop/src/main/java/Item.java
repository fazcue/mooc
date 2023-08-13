/**
 *
 * @author facu
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public Item(String product, int unitPrice) {
        this(product, 1, unitPrice);
    }
    
    public int price() {
        return this.unitPrice * this.qty;
    }
    
    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
