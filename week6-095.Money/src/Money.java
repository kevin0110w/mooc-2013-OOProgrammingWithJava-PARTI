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

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
      int euros1 = this.euros + added.euros;
      int cents1 = this.cents + added.cents;

      return new Money(euros1, cents1);
    }
    
    public boolean less(Money compared) {
        boolean less = true;
        if (this.euros() > compared.euros()) {
            less = false;
        } else if (this.euros() == compared.euros() && this.cents() > compared.cents()) {
            less = false;
        }
        return less;
    }
    
    public Money minus(Money decremented) {
        Money money = null;
        int euros = this.euros() - decremented.euros();
        int cents = this.cents() - decremented.cents();
        if (cents < 0) {
            euros--;
            cents = 100 + cents;
        }
        
        if (euros <= 0 || euros <= 0 && cents <= 0) {
            money = new Money(0,0);
        } else {
            money = new Money(euros, cents);
        }
        return money;
    }
}
  