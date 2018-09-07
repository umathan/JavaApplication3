package Chapter2;


import java.util.Scanner;

public class InvoiceAppExercise {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double overallTotal = 0;
        double totalDiscountAmount = 0;

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (!(choice.equalsIgnoreCase("n"))) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            }
            else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else{
                discountPercent = 0.0;
            }
            
            // calculate the total values of invoices, discount, and subtotal
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            count = count + 1;
             overallTotal = overallTotal + total;
            totalDiscountAmount = totalDiscountAmount + discountAmount;

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        
        // print out the total invoices, total, and discount amount. it should be outside the while loop
        System.out.println("Number of invoices: " + count);
        System.out.println("Average Invoice: " + overallTotal);
        System.out.println("Average Discount: " + totalDiscountAmount);
        
    }
}