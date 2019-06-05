package Bank.Singleton;

import Bank.Oberserver.Customer;
import Bank.Oberserver.StockMarket;

import java.util.ArrayList;

public class Bank implements StockMarket {
    private double initialIndex;
    private double stockIndex;
    private ArrayList customerList;
    private static Bank uniqueBank;

    private Bank() {
        //  this.accountNumber = accountNumber;
        customerList = new ArrayList();
    }

    public static Bank getUniqueBank() {
        if (uniqueBank == null) {
            uniqueBank = new Bank();
            System.out.println("A new bank has been created!");
        }
        return uniqueBank;
    }

    @Override
    public void registerCustomer(Customer c) {
        customerList.add(c);
    }

    @Override
    public void removeCustomer(Customer c) {
        int i = customerList.indexOf(c);
        if (i >= 0) {
            customerList.remove(i);
        }
    }

    @Override
    public void notifyCustomer() {
        for (int i = 0; i < customerList.size(); i++) {
            Customer customer = (Customer) customerList.get(i);
            customer.update(stockIndex);
        }
        System.out.println("All customers have been notified!");
    }

    private double previousValue;

    public void setStockIndex(double newStockIndex) {

        stockIndex = newStockIndex;
        // notify customers if the index drops by 50 points.
        System.out.println("Current index is " + newStockIndex);
        System.out.println("previous index is " + previousValue);
        if ((previousValue - newStockIndex) >= 50) {
            notifyCustomer();
        }
        previousValue = stockIndex;

    }

    public void setInitialIndex(double initialIndex) {
        this.initialIndex = initialIndex;
        previousValue = initialIndex;
        System.out.println("initial index is " + initialIndex);
    }
}
