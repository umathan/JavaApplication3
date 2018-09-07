package Chapter11ArraysExercise;

import java.util.Arrays;
import java.text.NumberFormat;

public class MonthlySales {

public static void main (String [] args){
    System.out.println("Monthly Sales\n");
    //String [] monthNames = new String[12];
    String [] monthNames = {"January", "February", "March", "April", "May", 
                            "June", "July", "August", "September"
                            , "October", "November", "December"};
    
    double[] monthSales = { 10.1, 11.2, 12.3, 13.4, 14.5, 15.6, 17.7, 18.9, 19.6, 10, 15, 48};
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    String choice = "y";
    
    while (choice.equalsIgnoreCase("y")){
      
       int monthNumber = Console.getInt("Enter a month: ");
                
        if(monthNumber <1 || monthNumber > monthNames.length){
            
           Console.displayMessage("Invalid month number. Please try again");
           continue;
        }
        int monthIndex = monthNumber-1;
            Console.displayMessage("Sales for " + monthNames[monthIndex] + 
                    currency.format(monthSales[monthIndex]) + "\n");
        
    
    choice = Console.getString("Do you want to Continue? y/n");
    Console.displayMessage();
    
    }
    
    double sum = 0.0;
     
    for (double monthSale : monthSales){
        sum += monthSale;
    }
    Console.displayMessage("Total Sales : " + currency.format(sum));
    
    }
    
    
    }


