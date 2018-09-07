package Chapter5Practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {


    public static double getDoubleWithinRange(Scanner sc, String prompt, int min, int max){
        double d = 0;
        boolean isValid = false;
        
        while(!isValid){
            d = getDouble(sc, prompt);
            if (d <= min){
                System.out.println("Error! Please enter a number that is greater than " + min);
            }
            else if (d >= max){
                System.out.println("Error! Please enter a number that is lesser than " + max);
            }
            else {
                isValid = true;
            }
            
        }
        return d;
    }
    
    public static double getDouble(Scanner sc, String prompt){
        double d = 0;
        boolean isValid = false;
        
        while (!isValid){
            System.out.print(prompt);
            if(sc.hasNextDouble()){
                d = sc.nextDouble();
                isValid = true;
            }else {
                System.out.println("Error. Invalid Number. Try again.");
            }
            sc.nextLine();
        }
        return d;
    }
    
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max){
        int n = 0;
        boolean isValid = false;
        
        while(!isValid){
            n = getInt(sc, prompt);
            if (n < min){
                System.out.println("Please enter a number that is greater than " + min);
            }
            else if (n > max){
            System.out.println("Please enter a number that is lesser than " + max);
        }else{
                isValid = true;
            }
        }
        
        return n;
    }
    
    public static int getInt(Scanner sc, String prompt){
        int n = 0;
        boolean isValid = false;
        
        while (!isValid){
            System.out.print(prompt);
            if(sc.hasNextInt()){
                n = sc.nextInt();
                isValid = true;
            }
            else {
                System.out.println("Please enter a valid number");
            }
            sc.nextLine();
        }
        return n;
    }
    
    public static double calculateFutureValue (double monthlyInvestment, double monthlyInterestRate, int months){
        double futureValue = 0.0;
        
        for (int i = 1; i < months; i++){
            
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
        }
        
        return futureValue;
    }
    
    
    private static void printFormattedFutureValueResults(double monthlyInvestment, double interestRate, int years, double futureValue){
        NumberFormat c = NumberFormat.getCurrencyInstance();
            NumberFormat p = NumberFormat.getPercentInstance();
            p.setMinimumFractionDigits(1);
            
            // format the result as a single String
            
            String results = "Monthly Investment: " + c.format(monthlyInvestment) + "\n"
                    + "Yearly Interest Rate: " + p.format(interestRate/100) + "\n"
                    + "Number of Years:  " + years + "\n"
                    + "Future Value:   " + c.format(futureValue) + "\n";
           
            System.out.println(results);
    }
    
    public static String askToContinue(Scanner sc){
        System.out.println("Do you wish to continue: y/n");
        String choice = sc.next();
        sc.nextLine();
        return choice;
    }
    //****************************
    
    public static void main (String [] args){
        
        System.out.println("Welcome to the Future Value Calculator\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")){
            System.out.println("DATA ENTRY");
            double monthlyInvestment = getDoubleWithinRange(sc, "Enter Monthly Investment", 0, 1000);
            double interestRate = getDoubleWithinRange(sc, "Enter yearly Interst", 0, 30);
            int years = getIntWithinRange(sc, "Enter number of years", 0, 100);
            System.out.println();
            
            
            // calculate the future value
            double monthlyInterestRate = interestRate/12/100;
            int months  = years*12;
            double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);
            
            // get currency and percent formatters
            
            
            // print the results
            System.out.println("FORMATTED RESULTS");
                 
              printFormattedFutureValueResults(monthlyInvestment, interestRate, years, futureValue);
              choice = askToContinue(sc);
                System.out.println();
            
        }
        
        
    
}
}
