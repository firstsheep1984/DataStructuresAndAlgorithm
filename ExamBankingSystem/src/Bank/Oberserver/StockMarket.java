package Bank.Oberserver;

public interface StockMarket {
    public void registerCustomer(Customer c);
    public void removeCustomer(Customer c);
    public void notifyCustomer();
}
