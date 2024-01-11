import account.*;

public class Main {
    public static void main(String[] args) {
//        CheckingAccount account = new CheckingAccount(150, 0.025, 500);
//        System.out.println(account.getRewardPoints());
//        if(account.purchase(20)){
//            System.out.println("Purchase successful");
//        }
//        else {
//            System.out.println("Purchase failed");
//        }
//        System.out.println(account.getRewardPoints());

        //CheckingAccount ca = new CheckingAccount(150, 0.025, 500);
        //SavingAccount sa = new SavingAccount(150,0.080);
//        ca.status();
//        sa.status();
//
//        ca.withdraw(10);
//        sa.withdraw(20);
//
//        ca.status();
//        sa.status();


        SilverCheckingAccount silver = new SilverCheckingAccount(5000, 0.025, 1000);
        System.out.println(silver.getRewardPoints());
        silver.purchase(50);
        System.out.println(silver.getRewardPoints());


        GoldCheckingAccount gold = new GoldCheckingAccount(5000, 0.025, 1000);
        System.out.println(gold.getRewardPoints());
        gold.purchase(50);
        System.out.println(gold.getRewardPoints());


        DiamondCheckingAccount diamond = new DiamondCheckingAccount(5000, 0.025, 1000);
        System.out.println(diamond.getRewardPoints());
        diamond.purchase(50);
        System.out.println(diamond.getRewardPoints());
    }
}