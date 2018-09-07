
package Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;


public class FutureValueApplication_Exercise {
 

    public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();
            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();
                    
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);
           
            String table = " ";
            String headerRow = "Year      " ;
            for ( double rate = 5.0; rate < 7.0; rate +=.5){
                headerRow = headerRow + percent.format(rate/100) + "           ";
             }
            table += headerRow + "\n";
           
            for (years = 1; years < 6; years++){
                
                String row = years + "      ";
                
                for (double rate = 5.0; rate < 7; rate += .5){
                    
                    int months = years * 12;
                    double monthlyInterestRate = rate/12/100;
                    double futureValue = 0.0;
                    for (int i = 1; i <=months; i++){
                        
                        futureValue = (futureValue + monthlyInvestment) * (1+monthlyInterestRate);
                    }
                    
                    row += currency.format(futureValue) + "         ";
                    
                }
                
            table += row + "\n";
                
            }
            System.out.println(table);
            
            
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        System.out.println("Bye!");
    }
}

