// Don't modfy this class
import java.util.Objects;

public class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Person)) {
            return false;
        }
        
        Person comparedObj = (Person) obj;
        
        return this.name.equals(comparedObj.getName()) &&
                this.height == comparedObj.getHeight();
    }

}
