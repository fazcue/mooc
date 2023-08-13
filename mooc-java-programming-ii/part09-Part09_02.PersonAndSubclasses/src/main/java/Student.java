/**
 *
 * @author facu
 */
public class Student extends Person{
    private int credits;

    public Student(String fullName, String address) {
        super(fullName, address);
        this.credits = 0;
    }
    
    public int credits() {
        return this.credits;
    }
    
    public void study() {
        this.credits++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
}
