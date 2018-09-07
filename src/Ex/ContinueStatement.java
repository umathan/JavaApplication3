package Ex;

import java.util.Scanner;

public class ContinueStatement {

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
           System.out.print("Please enter a number between 0 and 100: ");
           int number = sc.nextInt();
           if(number <0 || number > 100){
               System.out.println("INCORRECT....Please enter a number between 0 and 100");
               continue;
           }
            System.out.println("You entered the number: " + number);
            System.out.println("Do you want to continue: y/n? ");
            choice= sc.next();
            System.out.println();
        }
        
        
    }   
}
