package GC;

import java.util.Scanner;

public class FactorialRecursion {

public static void main (String [] args) {
    
    Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")){
        System.out.println("Please enter a number betwen 1 and 10");
    
        int userInput = sc.nextInt();
    if(userInput <1 || userInput > 10){
        System.out.println("Please enter a number within 1 and 10");
    } else {
        System.out.println("Factorial is " + factorial(userInput));
    }
        System.out.println("Do you want to continue: y/n");
        choice = sc.next();
        System.out.println();
        
    }
    
    
  
  }
  
public static int factorial(int n) {
       if(n ==1 || n == 0){
           return 1;
       }else
           return factorial(n-1)*n;
   }
    
    
}
