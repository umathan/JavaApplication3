package Project9;

public class CheckingAccount extends Account {
    
    private double monthlyFee;
    
    public CheckingAccount(double monthlyFee){
        super();
        this.monthlyFee = monthlyFee;
    }
    
    // subtractMonthlyFee is the method instead of setMonthlyFee. just because we have some calculations, we are changing the method name to subtractMonthlyFee
    
    public void subtractMonthlyFee(){
        
        double balance = (super.getBalance() - monthlyFee);
        
        super.setBalance(balance);
    }
    
    public double getMonthlyFee(){
        return monthlyFee;
    }
}
