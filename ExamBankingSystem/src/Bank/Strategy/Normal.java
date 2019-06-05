package Bank.Strategy;

public class Normal implements Investment{

    @Override
    public void investmoney(double amount) {
        System.out.println("You invest $" + amount +" into normal savings.");
    }
}
