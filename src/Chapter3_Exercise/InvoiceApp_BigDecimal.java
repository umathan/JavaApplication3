package Chapter3_Exercise;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InvoiceApp_BigDecimal {

public static void main (String[] args){
    final BigDecimal SALES_TAX = new BigDecimal("0.06");
    Scanner sc = new Scanner(System.in);
    
    String choice = "Y";
    
    
    while (choice.equalsIgnoreCase("y")){
        
        System.out.println("Enter subtotal: ");
        String subtotalStrg =  sc.next();
        // creating BigDecimal Objects for subtotal and discounts
        
        BigDecimal subtotal = new BigDecimal(subtotalStrg);
        BigDecimal discountPercent;
        if (subtotal.doubleValue() >= 100){
            discountPercent = new BigDecimal("0.2");
        }
        else {
            discountPercent = new BigDecimal ("0.0");
        }
         
        BigDecimal discountAmount = subtotal.multiply(discountPercent).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
        BigDecimal salesTax = totalBeforeTax.multiply(SALES_TAX).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalAmount = totalBeforeTax.add(salesTax);
        
        //format the display results
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        String message = 
                "Discount Percent: " + percent.format(discountPercent) + "\n"+
                "Discount Amount:  " + currency.format(discountAmount) + "\n" +
                "Total Before Tax: " + currency.format(totalBeforeTax) + "\n" + 
                "Sales Tax : "  + currency.format(salesTax) + "\n" + 
                "InvoiceTotal: " + currency.format(totalAmount);
        
        System.out.println(message);
        
        
        System.out.println("Do you want to continue: y/n");
        choice = sc.next();
        System.out.println();
    }
}
    
}
