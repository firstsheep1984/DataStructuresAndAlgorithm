package Bank.Strategy;

public class MutualFund  implements Investment{

    @Override
    public void investmoney(double amount) {
        System.out.println("You invest $" + amount +" into mutual fund.");
    }
}
