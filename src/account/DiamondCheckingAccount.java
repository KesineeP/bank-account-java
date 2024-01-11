package account;

public class DiamondCheckingAccount extends CheckingAccount {
    public DiamondCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @java.lang.Override
    public int calculateRewardPoints(double cost) {
        int reward = 0;

        if(cost > 500) {
            reward += (int) (cost - 500) * 80;
            cost = 500;
        }
        if(cost > 100) {
            reward += (int) (cost -100) * 40;
            cost = 100;
        }
        reward += (int) cost * 40;
        return reward;
    }
}
