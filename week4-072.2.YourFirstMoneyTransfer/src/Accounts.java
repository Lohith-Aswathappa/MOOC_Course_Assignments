
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account Matt = new Account("Matt's account", 1000.0);
        Account My_Account = new Account("My account", 0.0);
        Matt.withdrawal(100);
        My_Account.deposit(100);
        System.out.println(Matt);
        System.out.println(My_Account);
    }

}
