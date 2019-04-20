
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        // the price of lunch is added to register
        // the amount of sold lunch is incremented by one
        // method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        if (cashGiven < 2.5) {    
        }
        else {
            this.cashInRegister += 2.5;
            economicalSold++;
            cashGiven -= 2.5;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven < 4.0) {    
        }
        else {
            this.cashInRegister += 4.0;
            this.gourmetSold++;
            cashGiven -= 4.0;
        }
        return cashGiven;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
    }   
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        boolean economicalS = false;
        if (card.balance() >= 2.5) {
            this.economicalSold ++;
            economicalS = true;
            card.pay(2.5);
    }
        return economicalS;
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        boolean gourmetS = false;
        if (card.balance() >= 4.0) {
            this.gourmetSold ++;
            gourmetS = true;
            card.pay(4.0);
    }
        return gourmetS;
    }
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
