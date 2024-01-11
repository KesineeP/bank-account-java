package account;

public class Account {
    protected double balance;
    private final double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public boolean withdraw(double amount) {
        if(balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void status() {
        System.out.printf("Balance: %.2f\n", balance);
    }
}
