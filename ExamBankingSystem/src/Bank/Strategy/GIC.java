package Bank.Strategy;

public class GIC implements Investment{

    @Override
    public void investmoney(double amount) {
        System.out.println("You invest $" + amount +" into GIC.");
    }
}
