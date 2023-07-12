
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author facu
 */
public class UserInterface {
    private RecipeList recipes;
    private Scanner scanner;
    
    public UserInterface() {
        this(new Scanner(System.in));
    }
    
    public UserInterface(Scanner scanner) {
        this.recipes = new RecipeList();
        this.scanner = scanner;
    }
    
    protected void start() {
        readRecipes();
        menu();
        
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            actions(input);
        }
    }
    
    protected void menu() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }
    
    protected void actions(String input) {
        switch (input) {
            case "list": 
                listRecipes();
                break;
            case "find name":
                findRecipesByName();
                break;
            case "find cooking time":
                findRecipesByCookingTime();
                break;
            case "find ingredient":
                findRecipesByIngredient();
                break;
        }
    }
    
    protected void readRecipes() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            
            while (readFile.hasNextLine()) {
                String name = readFile.nextLine();
                int cookingTime = Integer.valueOf(readFile.nextLine());
                
                ArrayList<String> ingredients = new ArrayList();
                
                while (readFile.hasNextLine()) {
                    String ingredient = readFile.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
                
                addRecipe(name, cookingTime, ingredients);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    protected void addRecipe(String name, int cookingTime, ArrayList<String> ingredients) {
        recipes.add(new Recipe(name, cookingTime, ingredients));
    }

    protected void listRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        recipes.print();
        System.out.println("");
    }
    
    protected void findRecipesByName() {
        System.out.print("Searched word: ");
        String name = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");
        recipes.findByName(name);
        System.out.println("");
    }
    
    protected void findRecipesByCookingTime() {
        System.out.print("Max cooking time: ");
        int cookingTime = Integer.valueOf(scanner.nextLine());
        
        System.out.println("");
        System.out.println("Recipes:");
        recipes.findByCookingTime(cookingTime);
        System.out.println("");
    }
    
    protected void findRecipesByIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Recipes:");
        recipes.findByIngredient(ingredient);
        System.out.println("");
    }
}
