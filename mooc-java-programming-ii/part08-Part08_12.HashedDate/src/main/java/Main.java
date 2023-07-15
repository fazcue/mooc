
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<SimpleDate, String> birthdays = new HashMap();
        
        SimpleDate object = new SimpleDate(1984, 2, 14);
        
        birthdays.put(object, "Facu");
        birthdays.put(new SimpleDate(1984, 8, 23), "Maia");
        
        System.out.println(object.equals(object));
        System.out.println(object.equals(new SimpleDate(1984, 2, 14)));
        System.out.println(object.equals(new SimpleDate(1984, 8, 23)));
        
        System.out.println(birthdays.get(object));
        System.out.println(birthdays.get(new SimpleDate(1984, 2, 14)));
        System.out.println(birthdays.get(new SimpleDate(1984, 8, 23)));
        
        

    }
}
