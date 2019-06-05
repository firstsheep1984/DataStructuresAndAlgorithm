package Bank.Oberserver;

import Bank.Multithread.StockIndexs;
import Bank.Singleton.Bank;

public class Bullentin implements Customer, DisplayDetail {


    private double stockIndex;
    private StockMarket stockMarket;

    public double getStockIndex() {
        return stockIndex;
    }

    @Override
    public void update(double stockIndex) {
        this.stockIndex = stockIndex;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current index: " + stockIndex );
    }

    public Bullentin(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerCustomer(this);
    }
    public Bullentin(){}
}
