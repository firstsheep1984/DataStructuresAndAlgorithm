package Bank;

import Bank.Multithread.StockIndexs;
import Bank.Oberserver.Bullentin;
import Bank.Singleton.Bank;
import Bank.Strategy.Account;
import Bank.Strategy.GIC;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = Bank.getUniqueBank();
        Bullentin bullentin = new Bullentin(bank);
        bank.setInitialIndex(25500);
       // bank.setStockIndex(25500);
        bank.setStockIndex(25400);

        Account account = new Account();
        account.setInvestmentType(new GIC(), 5000);
        account.displayInvestment();

        Runnable nasdaqIndex = new StockIndexs.NASDAQ(25400);
        Thread thread1 = new Thread(nasdaqIndex);
        Runnable dowJonesIndex = new StockIndexs.DowJones(18825);
        Thread thread2 = new Thread(dowJonesIndex);
        thread1.start();
        thread2.start();
    }
}
