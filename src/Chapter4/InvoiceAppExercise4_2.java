package Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceAppExercise4_2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter customer type (r/c/t/n): ");
            String customerType = sc.next();
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // get the discount percent
            double discountPercent = 0.0;
            //switch(customerType) 
            if(customerType.equalsIgnoreCase("r"))
            {
                //case "r":
                //case "R":
                    if (subtotal < 100) {
                        discountPercent = 0.0;
                    } else if (subtotal >= 100 && subtotal < 250) {
                        discountPercent = .1;
                    } else if (subtotal >= 250 && subtotal < 500) {
                        discountPercent = .25;
                    } else 
                        discountPercent = .3;
                    //break;
                //case "c":
                //case "C":
            }
            else if (customerType.equalsIgnoreCase("c"))
                    {
                    if (subtotal < 250) {
                        discountPercent = .2;
                    } else if (subtotal >= 250) {
                        discountPercent = .2;
                    }
        }
                   // break;
                
                //case "t":
                //case "T":
            else if(customerType.equalsIgnoreCase("t"))
            {if (subtotal < 500){
                        discountPercent = .4;
                    } else if (subtotal >= 500){
                        discountPercent =  .5;
                    }
            }
                   // break;
               // default:
            else{  discountPercent = 0.0;
            }
                    //break;
          

            // calculate the discount amount and round to 2 decimals
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // calculate the total
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                "Discount percent: " + percent.format(discountPercent) + "\n"
              + "Discount amount:  " + currency.format(discountAmount) + "\n"
              + "Total:            " + currency.format(total) + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
                    // see if the user wants to continue

    }
    
}
