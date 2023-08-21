

public class Checker {
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
    
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    public boolean timeOfDay(String string) {
        String[] arr = string.split(":");
        
        if (!arr[0].matches("([0-1][0-9])|(2[0-3])")) return false;
        
        if (!arr[1].matches("([0-5][0-9])")) return false;
        
        return arr[2].matches("([0-5][0-9])");
    }
}
