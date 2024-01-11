import account.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100, 0.025);
        account.status();
        account.deposit(20);
        account.withdraw(45.50);
        account.withdraw(200);
        account.status();
    }
}