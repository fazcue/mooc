
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared)  return true;
        
        if (!(compared instanceof Item)) return false;
        
        Item comparedItem = (Item) compared;
        
        return this.name.equals(comparedItem.name);
    }
    
    @Override
    public int hashCode() {
        int hash = 37;
        hash = 7 * hash + this.name.hashCode();
        
        return hash;
    }

}
