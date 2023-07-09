/**
 *
 * @author facu
 */
public class Exercise {
    private String name;
    private boolean completed;
    
    public Exercise(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }
    
    public Exercise(String name) {
        this(name, false);
    }
    
    public Exercise() {
        this("", false);
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isCompleted() {
        return this.completed;
    }
    
    public void setCompleted(boolean status) {
        this.completed = status;
    }
}
