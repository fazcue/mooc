
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    protected String getName() {
        return this.name;
    }
    
    protected int getCookingTime() {
        return this.cookingTime;
    }
    
    protected ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
