package Bank.Strategy;

public class Account {
    public Investment investmentType;
    private double amount;
    public Account() {
    }
    public  void setInvestmentType(Investment investment, double amount){
        this.investmentType = investment;
        this.amount = amount;
    }
    public void displayInvestment(){
        investmentType.investmoney(amount);
    }
}
