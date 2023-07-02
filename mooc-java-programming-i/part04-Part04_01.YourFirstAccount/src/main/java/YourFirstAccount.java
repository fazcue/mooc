
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account1 =new Account("Test", 100);
        
        account1.deposit(20);
        
        System.out.println(account1);
    }
}
