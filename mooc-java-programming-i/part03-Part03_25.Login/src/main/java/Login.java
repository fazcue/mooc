
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Arrays
        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        //Ask for data
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        //Login
        boolean isLoggedIn = false;
        int index = -1;
        
        //check username
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(userName)) {
                index = i;
                break;
            }
        }
        
        //check password
        if (index != -1) {
            if (passwords[index].equals(password)) {
                isLoggedIn = true;
            }
        }
        
        if (isLoggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
