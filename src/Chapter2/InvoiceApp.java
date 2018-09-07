package Chapter2;

import java.util.Scanner;

public class InvoiceApp {

public static void main (String [] args){
    
    System.out.println("Welcome to the Invoice Total Calculator");
    
    Scanner sc = new Scanner(System.in);
    String choice = "y";
    
    while(choice.equalsIgnoreCase("y")){
        
        System.out.println("Enter subtotal: ");
        int subtotal = sc.nextInt();
        
        double discountPercent = 0.0;
        
        if(subtotal >=200){
             discountPercent = .2;
            }
        else if(subtotal >=100){
             discountPercent = .1;
        }
        else{
             discountPercent = .0;
        }
        
        double discountedInvoiceAmount = subtotal * discountPercent;
        double invoiceTotal = subtotal - discountedInvoiceAmount;
        
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Discount Amount: " +  discountedInvoiceAmount);
        System.out.println("Invoice Total: " + invoiceTotal);
        
        System.out.println("Do you want to Continue: Y/N");
        choice = sc.next();
        System.out.println();
    }
    
}
    
}
