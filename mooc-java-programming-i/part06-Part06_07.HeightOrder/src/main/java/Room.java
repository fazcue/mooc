
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Room {
    ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.persons.get(0);
        
        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        
        this.persons.remove(shortest);
        
        return shortest;
    }
}
