
package Chapter5Exercise;

import java.util.Scanner;

public class GuessANumber {
    
    public static void main (String [] args){
        
        final int LIMIT = 10;
        
        Scanner sc = new Scanner(System.in);
        
// Math.random is the function for the system to guess a number.
// LIMIT is the maximum limit we are setting
// Math.random() * LIMIT means the system is guessing a number from 0.0 (Math.randon()) to(*) 10 (LIMIT)

         double d = Math.random() * LIMIT;
// casting the double (0.0) to int
         int number = (int)d;
             number++;
            int count = 1;
            String choice = "y";
            // while choice is yes 
            // within while loop you can have as many if and if else loops
            while(choice.equalsIgnoreCase("y")){
                System.out.print("Guess a Number between 1 and 10: ");
                // getting the number from the user
                int guessedNumber = sc.nextInt();
                // checking if the number guessed is within the range thought by the system
                if(guessedNumber <1 || guessedNumber > LIMIT ){
                    System.out.println("Invalid Guess. Please try again");
//continue command will let the program to come out of if(guessedNumber<1...)  and go back to the while loop
                    continue;
                }
                // checking if the user entered number is greater or lesser than the system guessed number
                if (guessedNumber < number){
                    System.out.println("Your guess is too low");
                    }
                else if (guessedNumber > number){
                    System.out.println("Your guess is too high");
                     }
                else {
                    System.out.println("You have guessed it right in " +  count + " tries");
                    System.out.println("The number that I guessed was " + number);
                    System.out.println("Do you want to continue the game: Y/N" );
                    choice = sc.next();
                 break;
                 //double e = Math.random() * LIMIT;
                 
// can give either break or continue y/n                 
                
                    }       
                       // count++ gives us the number of tries attempted by the user
                  count++;
                  
                  
                  
                  
            }
            
    
}
    
    }

