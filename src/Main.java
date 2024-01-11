import account.Account;
import account.CheckingAccount;
import account.SavingAccount;

public class Main {
    public static void main(String[] args) {
//        Account account = new Account(100, 0.025);
//        account.status();
//        account.deposit(20);
//        account.withdraw(45.50);
//        account.withdraw(200);
//        account.status();
//        CheckingAccount account = new CheckingAccount(120, 0.025);
//        account.status();
//        account.deposit(20);
//        account.withdraw(45.50);
//        account.status();

        SavingAccount account = new SavingAccount(150, 0.025);
        account.status();
        account.deposit(20);
        account.withdraw(2.50);
        account.status();
    }
}