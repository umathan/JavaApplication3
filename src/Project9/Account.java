package Project9;

public class Account implements Balanceable, Depositable, Withdrawable {
    
    private double balance;
    
    public Account(){
        balance = 0;
    }
    // implement Depositable interface
    @Override
    public void deposit(double amount){
        
        //balance = balance + amount;
        balance += amount;
    }
    
    
    @Override
    public void withdraw(double amount){
        
        //balance = balance - amount;
        balance -= amount;
        
    }
    
    @Override
    public void setBalance(double amount){
        
    }
    
    @Override
    public double getBalance(){
        return balance;
    }
    
}
