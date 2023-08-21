/**
 *
 * @author facu
 */
public class Literacy implements Comparable<Literacy>{
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private Double percent;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double percent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
    
    public double percent() {
        return this.percent;
    }

    @Override
    public int compareTo(Literacy compared) {
        return this.percent.compareTo(compared.percent);
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
    
    
}
