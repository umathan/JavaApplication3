/*

package Chapter8b;

import java.util.Scanner;

public class PersonApp {

    public static void main (String args[]){
        // display Welcome Message
        
        String fName;
        String lName;
        String cNumber;
        String ssnNumber;
        
        System.out.println("Welcome to the Person Manager");
        System.out.println();
        
        // perform 1 or more selections
        
        Scanner sc = new Scanner (System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            System.out.println("Create Customer or Employee? (c/e)  ");
            String input = sc.nextLine(); // read the product code
           
            
            Person p = PersonDB.getPerson(input);
            // get the person object
            //Person p = PersonDB.getPerson(input);
            
            // display the output
            
           /* System.out.println();
            Person cus = PersonDB.getPerson("c");
            Person emp = PersonDB.getPerson("e");
          */

/*
          
         if(input.equalsIgnoreCase("c")){
             
             
             System.out.println("FirstName: ");
              fName = sc.nextLine();
             System.out.println("LastName: ");
              lName = sc.nextLine();
             System.out.println("Customer Number: " );
              cNumber = sc.nextLine();
             System.out.println("You Entered a New Customer");
             
             System.out.println("Name: " +   
                    fName + " " + lName + "\n" + "Customer Number: " + cNumber);
         }
         else if(input.equalsIgnoreCase("e")){
             
             
             System.out.println("FirstName: ");
              fName = sc.nextLine();
             System.out.println("LastName: ");
              lName = sc.nextLine();
             System.out.println("SSN: " );
              ssnNumber = sc.nextLine();
             System.out.println("You entered a New Employee");
             
             
             System.out.println("Name: " + fName + " " + lName);
             System.out.println("SSN: " +  ssnNumber);
             
         }
          // see if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
        
        
    }

}
*/