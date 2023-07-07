
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return money;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = this.euros;
        int newCents = this.cents;
        
        if (decreaser.cents() > this.cents) {
            newEuros -= 1;
            newCents += 100 - decreaser.cents();
        }
        
        newEuros -= decreaser.euros();
        
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        
        return new Money(newEuros, newCents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        }
        
        if (this.euros == compared.euros()) {
                return this.cents < compared.cents();
        }
        
        return true;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
