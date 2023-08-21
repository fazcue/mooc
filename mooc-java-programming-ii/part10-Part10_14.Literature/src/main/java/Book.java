/**
 *
 * @author facu
 */
public class Book {
    private final String name;
    private final int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }
    
    public String name() {
        return this.name;
    }
    
    public int ageRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older";
    }
}
