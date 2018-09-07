package Chapter8b;

import java.util.Scanner;

public class PersonApplication {
    
    public static void main (String args[]){
        
         System.out.println("Welcome to the Person Manager");
        System.out.println();
        
        
        
        Scanner sc = new Scanner (System.in);
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            
           
           String input = Console8b.getStringOnly(sc, "Create Customer or Employee? (c/e): ", "c" , "e");
          //  System.out.println();
            
            String firstName = Console8b.getString( "First Name : ");
            String lastName = Console8b.getString( "LastName : ");
            
            Person person;
           if(input.equalsIgnoreCase("c")){
              
              
            
         
            
            String customerNumber = Console8b.getString("Customer Number: ");
            person = new Customer(firstName, lastName, customerNumber);
            System.out.println("You have entered a customer\n");
            System.out.println(person.toString());
            
                    }
           else if (input.equalsIgnoreCase("e")){
               
          
            System.out.println("SSN Number");
            String ssn = sc.nextLine();
            person = new Employee(firstName, lastName, ssn);
           
            System.out.println("You have entered an employee");
          
            System.out.println(person.toString());
            
         
           }
           System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
           
        }
        
    }
    
    
    
}

/// cant customer number or ssn from app referring P
// calling cNumber and SSN directly from this aapln file
// why personDB is throwing an error?