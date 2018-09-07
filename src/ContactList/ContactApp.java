
package ContactList;

import java.util.Scanner;


public class ContactApp {
    
    public static void main (String args[]){
        
        System.out.println("Welcome to the Contact List Application");
        System.out.println(" ");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            
            Contact contact = new Contact();
            contact.displayContact();
            
            String first = Console.getString("Enter First Name");
            contact.setFirstName(first);
            
            String last = Console.getString("Enter Last Name");
            contact.setLastName(last);
            
            String mail = Console.getString("Enter Email");
            contact.setEmail(mail);
            
            String phone = Console.getString("Enter Phone");
            contact.setGetPhone(phone);
            
            System.out.println("\n" + contact.displayContact());
            
            System.out.println("Do you want to continue : y/n");
            choice= sc.nextLine();
            System.out.println();
        }
        
        
        
    }
    
}
