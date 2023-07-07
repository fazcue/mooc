
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public SimpleDate getBirthday() {
        return this.birthday;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person comparedPerson = (Person) compared;
        
         return this.name.equals(comparedPerson.getName()) &&
                 this.height == comparedPerson.getHeight() && 
                 this.weight == comparedPerson.getWeight() && 
                 this.birthday.equals(comparedPerson.getBirthday());
    }
}
