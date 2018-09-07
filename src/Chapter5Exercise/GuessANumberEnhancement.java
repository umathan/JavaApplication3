package Chapter5Exercise;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessANumberEnhancement {
    
    public static void main(String[] args) {
        final int LIMIT = 10;

        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();

        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int number = (int) d;             // convert double to int
        number++;                         // int is >= 1 and <= limit
        
        Scanner sc = new Scanner(System.in);            
        int count = 1;
        while (true) {
            
           /* int guess = 0;
            try {
                System.out.print("Your guess: ");
                guess = sc.nextInt();
                
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid entry. Enter a valid number");
                sc.nextLine();
                continue;
            }
*/
           
           int guess = 0;
            System.out.println("Your guess: ");
           if (sc.hasNextInt()){
               guess = sc.nextInt();
               sc.nextLine();
           
           }
           else{
               System.out.println("Invalid entry. Please enter a valid number");
               sc.nextLine();
               continue;
           }
           
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + 
                                   count + " tries.\n");
                break;
            }            
            count++;
        }
        System.out.println("Bye!");
    }   
}
