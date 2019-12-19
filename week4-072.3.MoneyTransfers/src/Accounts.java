
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account First = new Account("A", 100.0);
        Account Second = new Account("B", 0.0);
        Account Third = new Account("C", 0.0);

        transfer(First,Second,50.0);
        transfer(Second,Third,25.0);
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
