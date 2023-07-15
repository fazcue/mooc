
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author facu
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        this.owners = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.owners.get(licensePlate) == null) {
            this.owners.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.owners.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
         if (this.owners.get(licensePlate) != null) {
            this.owners.remove(licensePlate);
            return true;
        }
         
         return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.owners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList();
        
        
        for (String owner : this.owners.values()) {
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
            }
        }
        
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
