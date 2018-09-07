package Chapter5Practice;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FutureValueCalculatorExceptionHandling {

public static void main (String [] args){
 
    System.out.println("Welcome to the Future Value Calculator\n");
    Scanner sc = new Scanner (System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")){
        double monthlyInvestment;
        double interestRate;
        int years;
        
        try{
            System.out.println("Enter monthly investment:   ");
            monthlyInvestment = sc.nextDouble();
            System.out.println("Enter yearly interst rate:  ");
            interestRate = sc.nextDouble();
            System.out.println("Enter number of years:  ");
            years = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error! Invalid Number. Try Again!.\n");
            sc.nextLine();
            continue;
        }
        
        // calculate future value
        double monthlyInterestRate = interestRate/12/100;
        int months = years * 12;
        double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);
        
        // format and display the result
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Futurevalue: " + currency.format(futureValue) + "\n");
        
        System.out.println("Do you wish to continue: y/n");
        choice = sc.next();
        System.out.println();
    }
    
    
}
    
public static double calculateFutureValue (double monthlyInvestment, double monthlyInterestRate, int months){
    double futureValue = 0;
    
    for (int i = 1; i<=months; i++){
        
        futureValue = (futureValue + monthlyInvestment) * (1+ monthlyInterestRate);
        
    }
    return futureValue;
}

}
