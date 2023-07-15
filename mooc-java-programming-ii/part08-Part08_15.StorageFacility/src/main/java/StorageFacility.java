
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author facu
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    public StorageFacility() {
        this.storage = new HashMap();
    }
    
    public void add(String storageUnit, String item) {
        this.storage.putIfAbsent(storageUnit, new ArrayList());
        
        ArrayList<String> content = this.storage.get(storageUnit);
        
        content.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList());
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> content = this.storage.get(storageUnit);
        
        int indexItemToRemove = content.lastIndexOf(item);
        
        if (indexItemToRemove != -1) {
            content.remove(indexItemToRemove);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList();
        
        for (String unit : this.storage.keySet()) {
            if (this.storage.get(unit).size() > 0) {
                units.add(unit);
            }
        }
        
        return units;
    }
}
