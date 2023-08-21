
import java.util.Comparator;

/**
 *
 * @author facu
 */
public class Comparators {
    static  Comparator<Book> compareByName = Comparator.comparing(Book::name);
    static Comparator<Book> compareByAgeRecommendation = Comparator.comparing(Book::ageRecommendation);
}
