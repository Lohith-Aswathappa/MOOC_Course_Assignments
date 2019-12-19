
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    //private double balance;
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if(cashGiven >= PRICE_OF_ECONOMICAL){
            this.economicalSold++;
            this.cashInRegister += PRICE_OF_ECONOMICAL;
            return cashGiven - PRICE_OF_ECONOMICAL;
        }
        else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if(cashGiven >= PRICE_OF_GOURMET){
            this.gourmetSold++;
            this.cashInRegister += PRICE_OF_GOURMET;
            return cashGiven - PRICE_OF_GOURMET;
        }
        else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card){
        if(card.balance() >= PRICE_OF_ECONOMICAL){
            this.economicalSold++;
            card.pay(PRICE_OF_ECONOMICAL);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card){
        if(card.balance() >= PRICE_OF_GOURMET){
            this.gourmetSold++;
            card.pay(PRICE_OF_GOURMET);
            return true;
        }
        else{
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
