package Project9;

import Chapter7.Console;
import java.text.NumberFormat;

public class AccountBalanceApp {

    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // welcome message
        
        System.out.println("Welcome to the Account Application. \n");
        
        System.out.println("Starting Balances");
        
        
        // set some default values
        CheckingAccount checking = new CheckingAccount(1.0); // setting monthly fee
        SavingsAccount savings = new SavingsAccount(0.01); // setting monthly interest rate
        
        checking.setBalance(1000.0);
        savings.setBalance(1000.0);
        
        // display starting values
        System.out.println("Starting Balances: ");
        System.out.println("Checking:  " + checking.getBalance());
        System.out.println("Savings:  " + savings.getBalance());
        
        System.out.println("Enter the transactions for the month: \n");
        
        // continue until choice is "y" or "Y"
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            
           String transactionType = Console9.getString("Withdrawal or Deposit?  (w/d): ", "w", "d");
           String accountType = Console9.getString("Checkings or Savings? (c/s):  ", "c", "s");
           
           // set Account
           Account account;
           
           if(accountType.equalsIgnoreCase("c")){
               account = checking;
           }
           else {
               
               account = savings;
           }
           
           // get amount and deposit or withdraw it
           
           if(transactionType.equalsIgnoreCase("w")){
               
               double amount = Console9.getDouble("Amount: ?", 0, account.getBalance());
               account.withdraw(amount);
               
           } else{
               double amount = Console9.getDouble("Amount: ?" , 0, 1000);
               account.deposit(amount);
           }
            System.out.println();
            
            // see if the user wants to continue
            
            choice = Console9.getString("Continue? (y/n)", "y", "n");
            System.out.println();
            
            
            // make month-end calculations
            
            checking.subtractMonthlyFee();
            savings.calculateMonthlyInterestPayment();
            
            // display monthly fees
            System.out.println("Monthly payment and fees");
            System.out.println("Checking fee: " + currency.format(checking.getMonthlyFee()));
            System.out.println("Savings interest payment: " + currency.format(savings.getMonthlyInterestPayment()));
            System.out.println();
            
            // display final balances
            
            System.out.println("Final Balances");
            System.out.println("Checking: " +  currency.format(checking.getBalance()));
            System.out.println("Savings: " + currency.format(savings.getBalance()));
            System.out.println();
               
           
           
        }
        
        
        
        
        
        
        
    }
    
    
}
