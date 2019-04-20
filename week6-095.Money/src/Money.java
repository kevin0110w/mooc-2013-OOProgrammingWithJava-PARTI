public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        Money c = new Money(this.euros()+added.euros(), this.cents()+added.cents());
        return c;
    }
    
    public boolean less(Money compared) {
        boolean less = false;
        if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
            less = true;
        }
        else {
            less = false;
        }
        }
        if (this.cents() == compared.cents())  {
            if (this.euros() < compared.cents()) {
        less = true;
    }
            else {
                less = false;
            }
        }
         return less;
    }
    
    public Money minus(Money decremented) {
        int thisMoney = Money(this.euros, this.cents);
        
        
        if (this.euros() - decremented.euros() <= 0) {
            c.euros = 0 - 0;
        } else {
            c.euros = this.euros() - decremented.euros();
        }
        
        Money c = new Money(this.euros() - decremented.euros(), this.cents() - decremented.cents()) {
            
            }
        }
    

    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
