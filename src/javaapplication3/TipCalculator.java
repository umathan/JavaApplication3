
package javaapplication3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {
   
      
    public static void main (String[] args){
     
               
        System.out.println("Tip Calculator");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while(choice.equalsIgnoreCase("y")){
            
            System.out.print("Cost of Meal: ");
            double mealAmount = sc.nextDouble();
            
            double tipAmount1 = (mealAmount * 15)/100;
            double tipAmount2 = (mealAmount * 20)/100;
            double tipAmount3 = (mealAmount * 25)/100;
            
            double totalAmount1 = tipAmount1 + mealAmount;
            double totalAmount2 = tipAmount2 + mealAmount;
            double totalAmount3 = tipAmount3 + mealAmount;
            
            // converting to tipAmount to BigDecimal
            
            BigDecimal tipAmountConv1 = new BigDecimal(tipAmount1).setScale(2, RoundingMode.HALF_UP);
            BigDecimal tipAmountConv2 = new BigDecimal(tipAmount2);
            BigDecimal tipAmountConv3 = new BigDecimal(tipAmount3);
            
            // converting tip Amount to currency format
                       
            NumberFormat currency =  NumberFormat.getCurrencyInstance();
            tipAmountConv1 =  tipAmountConv1.setScale(2,RoundingMode.HALF_UP);
            tipAmountConv2 =  tipAmountConv2.setScale(2,RoundingMode.HALF_UP);
            tipAmountConv3 =  tipAmountConv3.setScale(2,RoundingMode.HALF_UP);
            
           // converting totalAmount to BigDecimal
           
           BigDecimal totalAmountConv1 = new BigDecimal(totalAmount1);
           BigDecimal totalAmountConv2 = new BigDecimal (totalAmount2);
           BigDecimal totalAmountConv3 = new BigDecimal (totalAmount3);
            
            totalAmountConv1 = totalAmountConv1.setScale(2,RoundingMode.HALF_UP);
            totalAmountConv2 = totalAmountConv2.setScale(2,RoundingMode.HALF_UP);
            totalAmountConv3 = totalAmountConv3.setScale(2,RoundingMode.HALF_UP);
            
            System.out.println("15%");
            
            System.out.println("Tip Amount:  " + currency.format(tipAmountConv1));
            System.out.println("Total Amount: " + currency.format(totalAmount1));
            
            System.out.println("20%");
            
            System.out.println("Tip Amount:  " + currency.format(tipAmountConv2));
            System.out.println("Total Amount: " + currency.format(totalAmount2));
            
            System.out.println("25%");
            
            System.out.println("Tip Amount:  " + currency.format(tipAmountConv3));
            System.out.println("Total Amount: " + currency.format(totalAmount3));
            
            System.out.print("Continue: y/n: "); 
            choice = sc.next();
                     
            
            
            
            }
        
        
    }
    
}
