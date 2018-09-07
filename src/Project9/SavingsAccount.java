package Project9;

public class SavingsAccount extends Account {

private double monthlyInterestRate;
private double monthlyInterestPayment;

public SavingsAccount (double montlyInterestRate){
    super();
    this.monthlyInterestRate = monthlyInterestRate;
}
    // setMonthlyInterestPayment
public void calculateMonthlyInterestPayment(){
    double balance = super.getBalance();
    monthlyInterestPayment = balance * monthlyInterestRate;
    double newBalance = monthlyInterestPayment + balance;
    super.setBalance(newBalance);
}

public double getMonthlyInterestPayment(){
    return monthlyInterestPayment;
}
}
