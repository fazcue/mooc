
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class RecipeList {
    private ArrayList<Recipe> list;
    
    public RecipeList() {
        this.list = new ArrayList();
    }
    
    protected void add(Recipe recipe) {
        list.add(recipe);
    }
    
    protected void findByName(String name) {
        for (Recipe recipe : list) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    protected void findByCookingTime(int cookingTime) {
        for (Recipe recipe : list) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    protected void findByIngredient(String ingredient) {
        for (Recipe recipe : list) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    protected void print() {
        for (Recipe recipe : list) {
            System.out.println(recipe);
        }
    }
}
