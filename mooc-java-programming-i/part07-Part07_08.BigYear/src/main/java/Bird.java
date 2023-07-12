/**
 *
 * @author facu
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }
    
    protected String getName() {
        return this.name;
    }
    
    protected void growObservation() {
        this.observations++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.observations + " observations";
    }
}
