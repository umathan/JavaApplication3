package chapter3_Exercise;
        
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;
//import java.text.NumberFormat;

public class MPGApp_Exercise {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            BigDecimal miles = new BigDecimal(sc.nextDouble());
            
            System.out.print("Enter gallons of gas used: ");
            BigDecimal gallons = new BigDecimal(sc.nextDouble());
            
            //double mpg = miles/gallons;
            //mpg = (double)Math.round(mpg * 100)/100);
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            //NumberFormat number = NumberFormat.getNumberInstance();
            //number.setMaximumFractionDigits(2);
            
            
            
            System.out.println("Miles per gallon is " + mpg.toString() + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
