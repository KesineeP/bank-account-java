package account;

public class SavingAccount extends Account{
    public SavingAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @java.lang.Override
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;

        return super.withdraw(amount);
    }
}
