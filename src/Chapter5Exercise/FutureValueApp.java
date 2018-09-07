package Chapter5Exercise;

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {
    
    public static void main (String[] args){
        
        System.out.println("Welcome to the Future Value Calucator\n");
        
        // creating a scanner sc object to get the input from the user
        Scanner sc = new Scanner (System.in);
        
        //declaring variable choice to give option to the user
        
         String choice = "y";
        
        // while loop to execute only if the user enters y, else it will come out of the loop
          while (choice.equalsIgnoreCase("y")){
            
            // get input from the user
            
            System.out.println("Entering the Data");
            
            double monthlyInvestment = getDoubleWithinRange(sc, "Enter monthly investment", 0, 1000);
            double interestRate = getDoubleWithinRange(sc, "Enter Yearly Interest Rate", 0, 30);
            int years = getIntWithinRange(sc, "Enter number of Yeears", 0, 100);
            
            System.out.println();
            
            // calcuate the future value.
            
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            double futureValue = calculateFutureValue (monthlyInvestment, monthlyInterestRate, months);
            
            // get the currency and percent formatters
            
            /*NumberFormat c = NumberFormat.getCurrencyInstance();
            NumberFormat p = NumberFormat.getPercentInstance();
            p.setMinimumFractionDigits(1);
*/            

            // format the restult as a single string
/*
            
            String results = "Monthly investment: " + c.format(monthlyInvestment) + "\n" 
                     + "Yearly interest rate: " + p.format(interestRate /100) + "\n"
                     + "Number of years:  " + years + "\n"
                    + "Future Value: " + c.format(futureValue) + "\n";
  
*/
            // print the results 
            
            System.out.println("Formatted Results");
            printFormattedResults(monthlyInvestment, interestRate, years, futureValue);
            // System.out.println(results);
              
                        // see if the user wants to continue
            
            /*
            System.out.println("Continue (y/n)");
            choice = sc.next();
            */
            choice = askToContinue(sc);
            
            sc.nextLine(); // discard any other data entered on the line
            
            System.out.println();
        }
        
       
            
            
        }
        
     public static double getDoubleWithinRange (Scanner sc, String prompt, double min, double max){
       double  d = 0;
       boolean isValid = false;
       
       while(!isValid){
          d = getDouble(sc, prompt);
          // checks if the user entered number meets the requirement ; i.e. min or max value
           if (d <= min){
               System.out.println(" Pls check. Number must be greater than " + min + ".");
               }
           else if (d >= max){
               System.out.println("Please Check. Number must be less than " + max + ".");
           }
           else{
               isValid = true;
           }
       }
       return d;
     }
     
     public static double getDouble(Scanner sc, String prompt){
         double d = 0;
         boolean isValid = false;
         while (!isValid){
             System.out.println(prompt);        
             if (sc.hasNextDouble()){
                 d = sc.nextDouble();
                 isValid = true;
             }
             else {
                 System.out.println("Invalid Number. Please Try Again");
             }
             sc.nextLine(); // to discard any other data entered on the line
         }
         return d;               
     }
   
   public static int getIntWithinRange (Scanner sc, String prompt, int min, int max){
       
       int i = 0;
       boolean isValid = false;
       while (!isValid){
           i = getInt(sc, prompt);
           if (i <=min){
               System.out.println("Error! Number must be greater than " + min + ".");
           }
           else if (i >= max){
               System.out.println("Error! Number must be lesser than " + max + "." );
           }
           else {
               isValid = true;
           }
       }
       return i;
   }
     

   public static int getInt (Scanner sc, String prompt){
    int i = 0;
    boolean isValid = false;
    while (!isValid){
        System.out.println(prompt);
        if (sc.hasNextInt()){
            i = sc.nextInt();
            isValid = true;
        }
        else {
            System.out.println("Error! Invalid Integer. Try Again.");
        }
        sc.nextLine(); // discard any other data entered on the line.
    }
        return i;
   }
 
   public static double calculateFutureValue (double monthlyInvestment, double monthlyInterestRate, int months){
       
       double futureValue = 0;
       
       for (int i = 1; i <= months; i++){
           futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
             
       }
       return futureValue;
   }
 
   private static void printFormattedResults(double monthlyInvestment, double interestRate, int years, double futureValue){
       
 
            NumberFormat c = NumberFormat.getCurrencyInstance();
            NumberFormat p = NumberFormat.getPercentInstance();
            p.setMinimumFractionDigits(1);
 
            String results = "Monthly investment: " + c.format(monthlyInvestment) + "\n" 
                     + "Yearly interest rate: " + p.format(interestRate /100) + "\n"
                     + "Number of years:  " + years + "\n"
                    + "Future Value: " + c.format(futureValue) + "\n";
  
            System.out.println(results);
            
   }
 
   public static String askToContinue(Scanner sc){
              
          
              System.out.println("Continue (y/n)");
          String choice = sc.next();
         return choice;
   }
   
   
}